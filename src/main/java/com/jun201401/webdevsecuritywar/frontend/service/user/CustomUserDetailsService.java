package com.jun201401.webdevsecuritywar.frontend.service.user;

import com.jun201401.webdevsecuritywar.frontend.adaptor.user.UserAdaptor;
import com.jun201401.webdevsecuritywar.frontend.dto.user.GetUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserAdaptor userAdaptor;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        GetUserDto getUserDto = userAdaptor.getUser(userId);
        return new User(getUserDto.getId(), getUserDto.getPassword(),
            Collections.singleton(new SimpleGrantedAuthority(getUserDto.getUserAuthority())));
    }
}



