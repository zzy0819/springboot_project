package com.example.zzy;

import com.example.zzy.dao.EmployeeMapper;
import com.example.zzy.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class EmployeeTest {

    @Resource
    private EmployeeMapper employeeMapper;

    @Test
    public void selectAllEmployee(){
    List<Employee> employees = employeeMapper.getAll();
    }
}
