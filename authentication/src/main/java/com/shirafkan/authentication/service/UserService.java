package com.shirafkan.authentication.service;


import com.shirafkan.authentication.entity.User;

public interface UserService {

    User getUserByEmail(String email);
}