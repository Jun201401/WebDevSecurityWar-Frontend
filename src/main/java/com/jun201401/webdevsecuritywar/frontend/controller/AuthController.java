package com.jun201401.webdevsecuritywar.frontend.controller;

import com.jun201401.webdevsecuritywar.frontend.dto.user.PostUserDto;
import com.jun201401.webdevsecuritywar.frontend.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    public String doSignUp(@ModelAttribute @Valid PostUserDto postUserDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors() || !postUserDto.getEmailVerified()) {
            return "auth/signup";
        }
        authService.createUser(postUserDto);
        return "redirect:/auth/login";
    }

    @PostMapping("/verifyEmail")
    @ResponseBody
    public boolean verifyEmail(@RequestParam String email, @RequestParam String code) {
        return authService.verifyEmail(email, code);
    }
}
