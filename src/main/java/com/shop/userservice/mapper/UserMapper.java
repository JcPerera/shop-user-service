package com.shop.userservice.mapper;

import com.shop.userservice.dto.UserDto;
import com.shop.userservice.dto.UserResponseDto;
import com.shop.userservice.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);
    List<User> userDtoListToUserList(List<UserDto> userDtos);
    List<UserDto> userListToUserDtoList(List<User> users);

    User userToUserResponse(UserResponseDto userResponseDto);
    UserResponseDto userResponseToUser(User user);
    List<User> userListToUserResponse(List<UserResponseDto> userResponseDtos);
    List<UserResponseDto> userResponseListToUserList(List<User> users);
}
