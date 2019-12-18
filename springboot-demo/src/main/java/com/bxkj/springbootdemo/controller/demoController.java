package com.bxkj.springbootdemo.controller;

import com.bxkj.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class demoController {
    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public List<Map> hello(){
       return userService.sel();
    }
}
