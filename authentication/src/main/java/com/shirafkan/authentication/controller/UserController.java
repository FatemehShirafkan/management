package com.shirafkan.authentication.controller;

import com.shirafkan.authentication.controller.request.AuthenticationRequest;
import com.shirafkan.authentication.entity.User;
import com.shirafkan.authentication.service.UserService;
import com.shirafkan.authentication.util.CryptoUtil;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<String> authenticateUser(
            @Valid @RequestBody AuthenticationRequest request
    ) {

        User user = userService.getUserByEmail(request.getEmail());

        // CryptoUtil.java - see it in source code
        //
        if (request.getPassword().equals(CryptoUtil.decrypt(user.getPassword()))) {

            // password matched, we can generate JWT

        }

        // todo: Generate JWT
        return null;
    }
}