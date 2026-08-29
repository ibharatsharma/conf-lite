package com.bharat.conflite.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(
            @RequestParam(required = false) String error,
            @RequestParam(required = false) String logout,
            @RequestParam(required = false) String registered,
            Model model) {

        model.addAttribute("loginError", error != null);
        model.addAttribute("logout", logout != null);
        model.addAttribute("registered", registered != null);

        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {

        model.addAttribute(
                "form",
                new RegistrationForm());

        return "register";
    }

    @PostMapping("/register")
    public String register(
            @ModelAttribute RegistrationForm form,
            Model model) {

        try {

            userService.register(form);

            return "redirect:/login?registered";

        } catch (IllegalArgumentException ex) {

            model.addAttribute(
                    "form",
                    form);

            model.addAttribute(
                    "error",
                    ex.getMessage());

            return "register";
        }
    }
}
