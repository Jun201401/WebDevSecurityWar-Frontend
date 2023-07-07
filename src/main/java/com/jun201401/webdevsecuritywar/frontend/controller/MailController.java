package com.jun201401.webdevsecuritywar.frontend.controller;

import com.jun201401.webdevsecuritywar.frontend.service.auth.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MailController {
    private final MailService mailService;

    @ResponseBody
    @PostMapping("/mail")
    public String MailSend(String mail) {

        int number = mailService.sendMail(mail);

        String num = "" + number;

        return num;
    }

    @ResponseBody
    @PostMapping("/mail/confirm")
    public boolean confirmNumber(String mail, int inputNumber) {
        return mailService.confirmNumber(mail, inputNumber);
    }
}
