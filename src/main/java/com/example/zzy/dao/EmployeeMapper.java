package com.example.zzy.dao;

import com.example.zzy.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    public List<Employee> getEmployee();
}
