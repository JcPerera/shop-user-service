package com.shop.userservice.controller;

import com.shop.userservice.dto.LoginDto;
import com.shop.userservice.dto.UserDto;
import com.shop.userservice.dto.UserResponseDto;
import com.shop.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/user")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.createUser(userDto));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getUserById(userId));
    }

    @PutMapping("/user/{userId}")
    public ResponseEntity<UserResponseDto> updateUser(@PathVariable String userId, @RequestBody UserDto userDto) {
        userDto.setId(userId);
        return ResponseEntity.ok(userService.updateUser(userDto));
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<UserResponseDto> deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/user/login")
    public ResponseEntity<UserResponseDto> loginUser(@RequestBody LoginDto loginDto) {
        UserResponseDto userResponseDto = userService.login(loginDto);
        if(userResponseDto == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        return ResponseEntity.ok(userResponseDto);
    }


}
