package com.timekeep.timekeeping.controller;

import com.timekeep.timekeeping.entity.User;
import com.timekeep.timekeeping.repository.UserRepository;
import com.timekeep.timekeeping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<>(userService.findAllUser(), HttpStatus.OK);
    }

}
