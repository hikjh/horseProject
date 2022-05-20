package com.stable.horseProject.dto;

import com.stable.horseProject.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private String name;
    private String userId;
    private String pwd;
    private String checkPwd;

    @Builder
    public UserSaveRequestDto(String name, String userId, String pwd, String checkPwd) {
        this.name = name;
        this.userId = userId;
        this.pwd = pwd;
        this.checkPwd = checkPwd;
    }

    public User toEntity() {
        return User.builder()
                .name(name)
                .userId(userId)
                .pwd(pwd)
                .checkPwd(checkPwd)
                .build();
    }
}
