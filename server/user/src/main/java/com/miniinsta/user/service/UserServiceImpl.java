package com.miniinsta.user.service;

import com.miniinsta.user.shared.UserDto;

import java.util.UUID;


public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
