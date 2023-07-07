package com.jun201401.webdevsecuritywar.frontend.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAdminDto {
    private String id;
    private String password;
    private String nickname;
    private String email;
    private String userRole;
}
