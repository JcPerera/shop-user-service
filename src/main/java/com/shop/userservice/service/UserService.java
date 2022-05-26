package com.shop.userservice.service;

import com.shop.userservice.dto.LoginDto;
import com.shop.userservice.dto.UserDto;
import com.shop.userservice.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto createUser(UserDto userDto);
    List<UserResponseDto> getAllUsers();
    UserResponseDto getUserById(String userId);
    UserResponseDto updateUser(UserDto userDto);
    void deleteUser(String userId);
    UserResponseDto login(LoginDto loginDto);
}
