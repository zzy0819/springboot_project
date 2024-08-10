package com.example.zzy.service;

import com.example.zzy.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    public boolean checkLogin(String username, String password);
}
