package com.jun201401.webdevsecuritywar.frontend.dto.user;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PostUserDto {
    private String id;
    private String password;
    private String nickname;
    private String email;
}
