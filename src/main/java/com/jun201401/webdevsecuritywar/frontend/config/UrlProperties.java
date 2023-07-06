package com.jun201401.webdevsecuritywar.frontend.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user.management.api")
@Getter
@Setter
public class UrlProperties {
    private String url;

    public String createUser() {
        return url + "/users";
    }
}
