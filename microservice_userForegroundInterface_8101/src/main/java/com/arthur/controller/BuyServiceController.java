package com.arthur.controller;

import com.arthur.bean.User;
import com.arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
public class BuyServiceController {
    @Autowired
    private UserService userService;

    @RequestMapping("/BuyServiceController")
    public String BuyServiceController(@RequestBody Map<String,String> map,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String result="";
        int serviceid=Integer.parseInt(map.get("serviceid"));
        int userid=Integer.parseInt(map.get("userid"));
        result=userService.buyOneService(serviceid,userid);
        return result;
    }
}
