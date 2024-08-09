package com.example.zzy.service;

import com.example.zzy.dao.UserDao;
import com.example.zzy.pojo.Employee;
import com.example.zzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private User user;
    @Override
    public User userLogin(String username, String password) {
        User user= userDao.getUserByUsername(username);
        if (user == null){
            System.out.println("你输入的是:"+username+password);
            System.out.println("给用户不存在");
            return null;
        }
        else{
            return user;
        }
    }
}
