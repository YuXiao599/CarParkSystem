package com.arthur.controller;

import com.arthur.bean.Gift;
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
public class GiftChangeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/GiftChangeController")
    public String GiftChange(@RequestBody Map<String,String> map, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Long userid=Long.parseLong(map.get("userid"));
        int giftid=Integer.parseInt(map.get("giftid"));
        String result=userService.ChangeGift(userid,giftid);
        return result;
    }
}
