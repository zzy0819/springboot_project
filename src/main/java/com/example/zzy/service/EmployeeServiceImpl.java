package com.example.zzy.service;

import com.example.zzy.dao.EmployeeDao;
import com.example.zzy.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Employee employee;

    @Override
    public Collection<Employee> getAllEmployee() {
        return employeeDao.getAll();
    }
}