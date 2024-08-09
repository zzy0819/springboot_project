package com.example.zzy.Controller;

import com.example.zzy.dao.EmployeeDao;
import com.example.zzy.pojo.Employee;
import com.example.zzy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @Autowired
    EmployeeDao employeeDao;
    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<Employee> employees = employeeService.getAllEmployee();
        System.out.println(employees);
        model.addAttribute("msg", employees);
//        model.addAttribute("emp", employees);
        return "emp/list";
    }
}
