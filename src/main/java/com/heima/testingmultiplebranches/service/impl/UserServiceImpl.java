package com.heima.testingmultiplebranches.service.impl;

import com.heima.testingmultiplebranches.mapper.UserMapper;
import com.heima.testingmultiplebranches.pojo.User;
import com.heima.testingmultiplebranches.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getById(Integer id) {
        return userMapper.getById(id);
    }
}
