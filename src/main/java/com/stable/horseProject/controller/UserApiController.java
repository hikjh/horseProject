package com.stable.horseProject.controller;

import com.stable.horseProject.dto.UserSaveRequestDto;
import com.stable.horseProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserApiController {

    private final UserService userService;

    @PostMapping("/api/join")
    public Long join(@RequestBody UserSaveRequestDto userSaveRequestDto) {
        return userService.join(userSaveRequestDto);
    }
}
