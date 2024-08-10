package com.example.zzy.service;

import com.example.zzy.dao.UserDao;
import com.example.zzy.dao.UserMapper;
import com.example.zzy.pojo.Employee;
import com.example.zzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private User user;
    @Override



    public boolean checkLogin(String username, String password){
        int checkFlag = userMapper.checkLogin(username, password);
        if (checkFlag == 1){
            System.out.println("用户存在，进行登录");
            return true;
        }else {
            System.out.println("用户不存在，请冲洗输入");
            return false;
        }


    }
}
