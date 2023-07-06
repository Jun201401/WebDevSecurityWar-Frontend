package com.jun201401.webdevsecuritywar.frontend.service.auth;

import com.jun201401.webdevsecuritywar.frontend.adaptor.user.UserAdaptor;
import com.jun201401.webdevsecuritywar.frontend.dto.user.PostUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    public final UserAdaptor userAdaptor;
    @Override
    public void createUser(PostUserDto postUserDto) {
        userAdaptor.createUser(postUserDto);
    }
}
