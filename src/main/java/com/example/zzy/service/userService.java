package com.example.zzy.service;

import com.example.zzy.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    public User userLogin(String username, String password);
}
