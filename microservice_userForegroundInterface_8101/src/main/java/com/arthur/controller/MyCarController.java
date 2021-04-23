package com.arthur.controller;

import com.arthur.bean.Car;
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
import java.util.LinkedList;
import java.util.List;

@RestController
public class MyCarController {
    @Autowired
    private UserService userService;

    @RequestMapping("/MyCarController")
    public List<Car> CarList(@RequestBody String useridString, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Long userid=Long.parseLong(useridString);
        List<Car> carList=userService.findMyCar(userid);
        return carList;
    }
}
