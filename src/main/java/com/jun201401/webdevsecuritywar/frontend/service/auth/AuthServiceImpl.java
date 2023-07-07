package com.jun201401.webdevsecuritywar.frontend.service.auth;

import com.jun201401.webdevsecuritywar.frontend.adaptor.user.UserAdaptor;
import com.jun201401.webdevsecuritywar.frontend.dto.user.PostUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    public final UserAdaptor userAdaptor;
    private final HttpSession session;

    @Override
    public void createUser(PostUserDto postUserDto) {
        userAdaptor.createUser(postUserDto);
    }

    @Override
    public boolean verifyEmail(String email, String code) {
        Integer sessionCode = (Integer) session.getAttribute(email.toLowerCase());
        Integer inputCode;
        try {
            inputCode = Integer.parseInt(code);
        } catch (NumberFormatException e) {
            return false;
        }
        return sessionCode != null && sessionCode.equals(inputCode);
    }

}

