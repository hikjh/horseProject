package com.stable.horseProject.service;


import com.stable.horseProject.domain.user.UserRepository;
import com.stable.horseProject.dto.UserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public Long join(UserSaveRequestDto userSaveRequestDto) {
        return userRepository.save(userSaveRequestDto.toEntity()).getId();
    }
}
