package com.example.demo.service.impl;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.dto.UserDto;
import com.example.demo.service.dto.UserResponseDto;
import com.example.demo.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDto save(UserDto userDto) {
        return userMapper.toResponseDto(userRepository.save(userMapper.toEntity(userDto)));
    }

    @Override
    public UserResponseDto find(Integer id) throws Exception {
        return userRepository.findById(id).map(userMapper::toResponseDto).orElseThrow(() ->
                new ResourceNotFoundException(String.valueOf(id)));
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public UserResponseDto update(Integer id, UserDto userDto) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
