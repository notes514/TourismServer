package com.ncvt.tourism.controller;

import com.ncvt.tourism.mapper.UserMapper;
import com.ncvt.tourism.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TourismController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/qeuryUser")
    public List<User> qeuryUser() {
        return userMapper.selectByExample(null);
    }

}
