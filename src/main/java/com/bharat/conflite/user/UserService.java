package com.bharat.conflite.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;
import java.util.UUID;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public User register(RegistrationForm form) {
        logger.info("registering user {}", form);
        String username = normalizeUsername(form.getUsername());
        String displayName = form.getDisplayName() == null
                ? ""
                : form.getDisplayName().trim();

        if (username.length() < 3) {
            throw new IllegalArgumentException(
                    "Username must contain at least 3 characters.");
        }

        if (!username.matches("[a-z0-9._-]+")) {
            throw new IllegalArgumentException(
                    "Username may contain lowercase letters, numbers, '.', '_' and '-'.");
        }

        if (userRepository.existsByUsername(username)) {
            throw new IllegalArgumentException(
                    "That username is already registered.");
        }

        if (displayName.isBlank()) {
            throw new IllegalArgumentException(
                    "Display name is required.");
        }

        if (form.getPassword() == null || form.getPassword().length() < 8) {
            throw new IllegalArgumentException(
                    "Password must contain at least 8 characters.");
        }

        if (!form.getPassword().equals(form.getConfirmPassword())) {
            throw new IllegalArgumentException(
                    "Passwords do not match.");
        }

        User user = new User(
                // UUID.randomUUID().toString(),
                null,
                username,
                passwordEncoder.encode(form.getPassword()),
                displayName,
                "USER",
                true,
                System.currentTimeMillis());
        logger.info("saving user {}", user);
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(
                normalizeUsername(username)).orElseThrow(() -> new IllegalArgumentException("User not found."));
    }

    private String normalizeUsername(String username) {
        return username == null
                ? ""
                : username.trim().toLowerCase(Locale.ROOT);
    }
}
