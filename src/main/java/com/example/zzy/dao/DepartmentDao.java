package com.example.zzy.dao;

import com.example.zzy.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;
    static {
        departments = new HashMap<>();
        departments.put(101, new Department(101, "财务部"));
        departments.put(102, new Department(102, "教学部"));
        departments.put(103, new Department(103, "商务部"));
        departments.put(104, new Department(104, "国防部"));
        departments.put(105, new Department(105, "公安部"));
    }
    public Collection<Department> getAllDepartments(){
        return departments.values();
    }

    public Department getById(Integer id){
        return departments.get(id);
    }

}
