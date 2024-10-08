package com.example.zzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@Component
public class Employee {
    private Integer id;
    private String lastName;
    private Integer departmentId;
    private String email;
    private Integer gender;
    private Department department;
    private Date birth;

    public Employee(Integer id, String lastName, Integer departmentId, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }
}
