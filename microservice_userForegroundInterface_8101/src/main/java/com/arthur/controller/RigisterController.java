package com.arthur.controller;

import com.arthur.bean.User;
import com.arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

@Controller
public class RigisterController {
    @Autowired
     UserService userService;

    @RequestMapping("/RigisterController")
    public String register(@RequestBody Map<String,String> map, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = map.get("username");
        String userpwd = map.get("userpwd");
        String phone = map.get("phone");

        User user=new User();
        user.setUsername(username);
        user.setUserpwd(userpwd);
        user.setPhone(phone);
        user.setUserstate("启用");
        user.setScore("0");

        int result = userService.creatUser(user);

        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        if (result==1) {
            out.println("1");
        } else {
            out.println("0");
        }
        return null;
    }
}
