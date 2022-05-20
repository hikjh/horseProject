package com.stable.horseProject.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserSaveRequestDtoTest {

    @Test
    public void 롬복_기능_테스트() {

        String name = "김재현";
        String userId = "KJH";
        String pwd = "1234";
        String checkPwd = "1234";

        UserSaveRequestDto dto = new UserSaveRequestDto(name, userId, pwd, checkPwd);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getUserId()).isEqualTo(userId);
    }
}
