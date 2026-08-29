package com.bharat.conflite.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

@ControllerAdvice
public class WebModelAdvice {

    @ModelAttribute
    public void commonModel(
            HttpServletRequest request,
            Model model) {

        Authentication authentication = SecurityContextHolder
                .getContext()
                .getAuthentication();

        if (authentication != null
                && authentication.isAuthenticated()
                && !"anonymousUser".equals(authentication.getPrincipal())) {

            model.addAttribute(
                    "authentication",
                    authentication);
        } else {
            model.addAttribute(
                    "authentication",
                    null);
        }

        CsrfToken csrfToken = (CsrfToken) request.getAttribute(
                CsrfToken.class.getName());

        model.addAttribute(
                "csrf",
                csrfToken);
    }
}
