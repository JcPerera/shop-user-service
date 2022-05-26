package com.shop.userservice.service;

import com.shop.userservice.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getUserById(String userId);
    UserDto updateUser(UserDto userDto);
    void deleteUser(String userId);
}
