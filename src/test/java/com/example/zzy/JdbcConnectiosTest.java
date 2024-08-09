package com.example.zzy;

import com.example.zzy.utils.MybatisUtils;
import org.junit.jupiter.api.Test;

public class JdbcConnectiosTest {

    @Test
    public void Test(){
        System.out.println(MybatisUtils.getSession());
    }
}
