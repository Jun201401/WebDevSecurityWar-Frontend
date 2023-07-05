package com.jun201401.webdevsecuritywar.frontend.controller;

import com.jun201401.webdevsecuritywar.frontend.dto.user.PostUserDto;
import com.jun201401.webdevsecuritywar.frontend.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
    @GetMapping("/login")
    public String loginForm() {
        return "auth/login";
    }

    @GetMapping("/signup")
    public String signUpForm() {
        return "auth/signup";
    }

    @PostMapping("/signup")
    public String doSignUp(@ModelAttribute @Valid PostUserDto postUserDto) {
        authService.createUser(postUserDto);
        return "redirect:/auth/login";
    }
}
