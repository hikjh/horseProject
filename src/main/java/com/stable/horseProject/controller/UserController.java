package com.stable.horseProject.controller;

import com.stable.horseProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/join")
    public String joinForm() {
        return "/user/joinForm";
    }

}
