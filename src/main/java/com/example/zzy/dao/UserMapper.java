package com.example.zzy.dao;

import com.example.zzy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    int checkLogin(String username, String password);
}