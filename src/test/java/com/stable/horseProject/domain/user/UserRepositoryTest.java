package com.stable.horseProject.domain.user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class UserRepositoryTest {
    
    @Autowired
    UserRepository userRepository;

    @AfterEach
    public void cleanup() {
        userRepository.deleteAll();
    }

    @Test
    public void 회원가입() {
        String name = "김재현";
        String userId = "KJH";
        String pwd = "1234";
        String checkPwd = "1234";

        userRepository.save(User.builder()
                .name(name)
                .userId(userId)
                .pwd(pwd)
                .checkPwd(checkPwd)
                .build());

        List<User> userList = userRepository.findAll();

        User user = userList.get(0);

        assertThat(user.getName()).isEqualTo(name);
        assertThat(user.getUserId()).isEqualTo(userId);
    }

}
