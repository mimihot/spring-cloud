package com.bxkj.springbootdemo.service.impl;

import com.bxkj.springbootdemo.dao.UserDao;
import com.bxkj.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<Map> sel() {
        return userDao.Sel();
    }
}
