package com.jun201401.webdevsecuritywar.frontend.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "service")
@Getter
@Setter
public class UrlProperties {
    private String userManagementApiUrl;
    private String boardServiceApiUrl;

    public String getUser() {
        return userManagementApiUrl + "/users/{userId}";
    }
    public String createUser() {
        return userManagementApiUrl + "/users";
    }


    public String getAllBoards() {
        return boardServiceApiUrl + "/boards";
    }


}
