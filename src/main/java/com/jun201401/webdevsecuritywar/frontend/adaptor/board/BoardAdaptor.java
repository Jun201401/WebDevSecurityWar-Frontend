package com.jun201401.webdevsecuritywar.frontend.adaptor.board;

import com.jun201401.webdevsecuritywar.frontend.config.UrlProperties;
import com.jun201401.webdevsecuritywar.frontend.dto.board.GetBoardDto;
import com.jun201401.webdevsecuritywar.frontend.util.DefaultHttpHeader;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardAdaptor {
    private final RestTemplate restTemplate;
    private final UrlProperties urlProperties;

    public List<GetBoardDto> getAllBoards() {
        HttpEntity<String> requestEntity = new HttpEntity<>(DefaultHttpHeader.getHeader());

        ResponseEntity<List<GetBoardDto>> exchange =
                restTemplate.exchange(urlProperties.getAllBoards(),
                        HttpMethod.GET,
                        requestEntity,
                        new ParameterizedTypeReference<>() {
                        });
        return exchange.getBody();
    }
}
