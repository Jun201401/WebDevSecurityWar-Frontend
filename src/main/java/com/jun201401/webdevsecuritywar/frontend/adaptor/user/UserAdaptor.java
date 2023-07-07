package com.jun201401.webdevsecuritywar.frontend.adaptor.user;

import com.jun201401.webdevsecuritywar.frontend.config.UrlProperties;
import com.jun201401.webdevsecuritywar.frontend.dto.user.GetUserDto;
import com.jun201401.webdevsecuritywar.frontend.dto.user.PostUserDto;
import com.jun201401.webdevsecuritywar.frontend.dto.user.RespUserDto;
import com.jun201401.webdevsecuritywar.frontend.util.DefaultHttpHeader;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;

@Service
@RequiredArgsConstructor
public class UserAdaptor {
    private final RestTemplate restTemplate;
    private final UrlProperties urlProperties;
    private final PasswordEncoder passwordEncoder;

    public GetUserDto getUser(String userId) {
        HttpEntity<String> requestEntity = new HttpEntity<>(DefaultHttpHeader.getHeader());

        ResponseEntity<GetUserDto> exchange =
                restTemplate.exchange(urlProperties.getUser(),
                        HttpMethod.GET,
                        requestEntity,
                        new ParameterizedTypeReference<>() {
                        }, userId);
        return exchange.getBody();
    }

    public RespUserDto createUser(PostUserDto postUserDto) {
            postUserDto.setPassword(passwordEncoder.encode(postUserDto.getPassword()));
        HttpEntity<PostUserDto> requestEntity = new HttpEntity<>(postUserDto, DefaultHttpHeader.getHeader());

        ResponseEntity<RespUserDto> exchange =
                restTemplate.exchange(urlProperties.createUser(),
                        HttpMethod.POST,
                        requestEntity,
                        new ParameterizedTypeReference<>() {
                        });
        return exchange.getBody();
    }
}
