package com.jun201401.webdevsecuritywar.frontend.service.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

@Service
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender javaMailSender;
    private final HttpSession session;
    private static final String senderEmail= "sender201401@gmail.com";

    public void createNumber(String mail){
        int number = (int)(Math.random() * (90000)) + 100000;
        session.setAttribute(mail, number);
    }

    public MimeMessage CreateMail(String mail){
        createNumber(mail);
        MimeMessage message = javaMailSender.createMimeMessage();
        int number = (int) session.getAttribute(mail);
        try {
            message.setFrom(senderEmail);
            message.setRecipients(MimeMessage.RecipientType.TO, mail);
            message.setSubject("이메일 인증");
            String body = "";
            body += "<h3>" + "요청하신 인증 번호입니다." + "</h3>";
            body += "<h1>" + number + "</h1>";
            body += "<h3>" + "감사합니다." + "</h3>";
            message.setText(body,"UTF-8", "html");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return message;
    }

    public int sendMail(String mail){
        MimeMessage message = CreateMail(mail);
        javaMailSender.send(message);
        int number = (int) session.getAttribute(mail);
        return number;
    }

    public boolean confirmNumber(String mail, int inputNumber) {
        Integer number = (Integer) session.getAttribute(mail);
        if (number == null) {
            return false;
        } else {
            return number == inputNumber;
        }
    }
}
