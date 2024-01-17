package com.shirafkan.user.service;

import com.shirafkan.user.entity.UserEntity;
import com.shirafkan.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserEntity findUser(String username) {
        return userRepository.findByUsername(username);
    }

    ;
}
