package com.example.zzy.dao;

import com.example.zzy.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    List<User> selectUser();

    User getUserById(int id);

    int insertUser(User user);

    int upDateUser(String usernmae);

    int deleteUser(String username, String gender);

    List<User> getUserByLimit(Map<String, Integer> map);
}