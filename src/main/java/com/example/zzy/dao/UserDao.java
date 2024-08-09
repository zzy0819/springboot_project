package com.example.zzy.dao;
import com.example.zzy.pojo.User;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    private static Map<Integer, User> users = null;
    static {
        users = new HashMap<>();
        users.put(1, new User(1,"zzy",246, "男", 1234));
    }

    public User getUserByUsername(String username){
        return users.get(username);
    }

}
