package com.shirafkan.authentication.service;

import com.shirafkan.authentication.entity.User;
import com.shirafkan.authentication.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User getUserByEmail(String email) {

        return Optional.ofNullable(repository.findByEmail(email))
                .orElseThrow(() -> new RuntimeException("User with email is not found."));

    }
}