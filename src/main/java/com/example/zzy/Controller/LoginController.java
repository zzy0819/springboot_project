package com.example.zzy.Controller;
import cn.hutool.core.util.StrUtil;
import com.example.zzy.pojo.User;
import com.example.zzy.service.userService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Resource
    private userService userservice;
    @Autowired
    private User user;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
            session.setAttribute("loginUser", username);

            if (userservice.checkLogin(username, password)){
                return "redirect:/main.html";
            }else{
                model.addAttribute("msg", "input error");
                return "index";
            }
    }

}
