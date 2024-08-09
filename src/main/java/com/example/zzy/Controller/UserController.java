package com.example.zzy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(String name, Model model){
        System.out.println("接受到的参数为"+name);
        model.addAttribute("msg", name);
        return "test";
    }
}
