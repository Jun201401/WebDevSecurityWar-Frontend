package com.jun201401.webdevsecuritywar.frontend.service.auth;

import com.jun201401.webdevsecuritywar.frontend.dto.user.PostUserDto;

public interface AuthService {
    void createUser(PostUserDto postUserDto);
    boolean verifyEmail(String email, String code);
}
