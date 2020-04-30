package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.service.dto.UserDto;
import com.example.demo.service.dto.UserResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserResponseDto save(UserDto userDto);
    UserResponseDto find(Integer id) throws Exception;
    Page<User> findAll(Pageable pageable);
    UserResponseDto update(Integer id, UserDto userDto);
    void delete(Integer id);
}
