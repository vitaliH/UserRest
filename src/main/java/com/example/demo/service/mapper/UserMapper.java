package com.example.demo.service.mapper;

import com.example.demo.domain.User;
import com.example.demo.service.dto.UserDto;
import com.example.demo.service.dto.UserResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDto userDto);
    UserResponseDto toResponseDto(User user);
}


