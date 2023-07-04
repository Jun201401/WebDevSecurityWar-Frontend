package com.jun201401.webdevsecuritywar.frontend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public String loginForm() {
        return "auth/login";
    }
}
