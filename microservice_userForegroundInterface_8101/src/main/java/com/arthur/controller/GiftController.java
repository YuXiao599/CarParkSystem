package com.arthur.controller;

import com.arthur.bean.Gift;
import com.arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class GiftController {
    @Autowired
    private UserService userService;

    @RequestMapping("/GiftController")
    public List<Gift> Gift(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Gift> giftList=null;
        request.setCharacterEncoding("UTF-8");
        giftList=userService.findAllGift();
        return giftList;
    }
}
