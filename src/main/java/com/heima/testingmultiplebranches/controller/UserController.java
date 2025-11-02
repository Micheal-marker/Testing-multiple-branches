package com.heima.testingmultiplebranches.controller;

import com.heima.testingmultiplebranches.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getById(@PathVariable Integer id) {
        return userService.getById(id);
    }
}
