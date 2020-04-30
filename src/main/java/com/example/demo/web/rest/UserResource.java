package com.example.demo.web.rest;

import com.example.demo.service.UserService;
import com.example.demo.service.dto.UserDto;
import com.example.demo.service.dto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.net.URI;

@RestController
public class UserResource {
    private UserService userService;

    @Autowired
    public UserResource(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<UserResponseDto> create(@RequestBody UserDto userDto){
        return ResponseEntity.created(URI.create("/users")).body(userService.save(userDto));
    }


    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponseDto> get(@PathVariable @Positive Integer id) throws Exception {
        return ResponseEntity.ok(userService.find(id));
    }

}
