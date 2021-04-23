package com.arthur.controller;

import com.arthur.bean.User;
import com.arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@RestController
public class FallbackController {
    @Autowired
    private UserService userService;

    @RequestMapping("/FallbackController")
    public String fallback(@RequestBody Map<String,String>map, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String useridString = map.get("userid");
        long userid=Long.parseLong(useridString);
        String massage = map.get("massage");

        response.setCharacterEncoding("UTF-8");
        int result=userService.fallbackmassage(userid,massage);
        System.out.println(result);
        if (result==1) {
            return "1";
        } else {
            return "0";
        }
    }
}
