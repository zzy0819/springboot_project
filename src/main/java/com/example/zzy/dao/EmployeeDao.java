package com.example.zzy.dao;

import com.example.zzy.pojo.Department;
import com.example.zzy.pojo.Employee;
import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
       employees = new HashMap<>();
       employees.put(101, new Employee(101, "AA","2423124@qq.com",0,new Department(101, "国防部")));
       employees.put(102, new Employee(102, "BB","2423224@qq.com",1,new Department(101, "国防部")));
       employees.put(103, new Employee(103, "CC","2421124@qq.com",0,new Department(101, "国防部")));
       employees.put(104, new Employee(104, "DD","2427124@qq.com",1,new Department(101, "国防部")));
       employees.put(105, new Employee(105, "EE","2420124@qq.com",0,new Department(101, "国防部")));
    }

    public static Integer initId = 1006;

    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }
    public Employee getEmployeeBId(Integer id){
        return employees.get(id);
    }
    public void delete(Integer id){
        employees.remove(id);
    }
}
