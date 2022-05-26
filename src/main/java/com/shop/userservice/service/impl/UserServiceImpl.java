package com.shop.userservice.service.impl;

import com.shop.userservice.dto.UserDto;
import com.shop.userservice.mapper.UserMapper;
import com.shop.userservice.model.User;
import com.shop.userservice.repository.UserRepository;
import com.shop.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        user.setUpdatedAt(new Date());
        user.setCreatedAt(new Date());
        User savedUser = userRepository.save(user);
        return userMapper.userToUserDto(savedUser);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.userListToUserDtoList(users);
    }

    @Override
    public UserDto getUserById(String userId) {
        User user = userRepository.findById(userId).orElse(null);
        return userMapper.userToUserDto(user);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User user = userRepository.findById(userDto.getId()).orElse(null);
        UserDto updatedUserDto = null;
        if(user != null){
            user = userMapper.userDtoToUser(userDto);
            user.setUpdatedAt(new Date());
            User updatedUser = userRepository.save(user);
            updatedUserDto = userMapper.userToUserDto(updatedUser);
        }
        return updatedUserDto;
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
