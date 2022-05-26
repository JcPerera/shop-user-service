package com.shop.userservice.service.impl;

import com.shop.userservice.dto.LoginDto;
import com.shop.userservice.dto.UserDto;
import com.shop.userservice.dto.UserResponseDto;
import com.shop.userservice.mapper.UserMapper;
import com.shop.userservice.model.User;
import com.shop.userservice.repository.UserRepository;
import com.shop.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserResponseDto createUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        user.setUpdatedAt(new Date());
        user.setCreatedAt(new Date());
        User savedUser = userRepository.save(user);
        return userMapper.userResponseToUser(savedUser);
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.userResponseListToUserList(users);
    }

    @Override
    public UserResponseDto getUserById(String userId) {
        User user = userRepository.findById(userId).orElse(null);
        return userMapper.userResponseToUser(user);
    }

    @Override
    public UserResponseDto updateUser(UserDto userDto) {
        User user = userRepository.findById(userDto.getId()).orElse(null);
        UserResponseDto updatedUserDto = null;
        if(user != null){
            user = userMapper.userDtoToUser(userDto);
            user.setUpdatedAt(new Date());
            User updatedUser = userRepository.save(user);
            updatedUserDto = userMapper.userResponseToUser(updatedUser);
        }
        return updatedUserDto;
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserResponseDto login(LoginDto loginDto) {
        User user = userRepository.findUserByUsername(loginDto.getUsername());
        boolean authenticated = bCryptPasswordEncoder.matches(loginDto.getPassword(), user.getPassword());
        UserResponseDto userResponseDto = null;
        if(authenticated){
            userResponseDto = userMapper.userResponseToUser(user);
        }
        return userResponseDto;
    }
}
