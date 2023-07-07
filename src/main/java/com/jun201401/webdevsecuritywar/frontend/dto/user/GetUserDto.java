package com.jun201401.webdevsecuritywar.frontend.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetUserDto {
    private String id;
    private String password;
    private String nickname;
    private String email;
    private String userAuthority;
}
