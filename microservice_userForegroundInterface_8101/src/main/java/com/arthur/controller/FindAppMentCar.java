package com.arthur.controller;


import com.arthur.bean.Parking;
import com.arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FindAppMentCar {
    @Autowired
    private UserService userService;

    @RequestMapping("/FindAppMentCar")
    public List<Parking> FindApp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Parking> parkingList = new ArrayList<>();
        request.setCharacterEncoding("UTF-8");
        parkingList=userService.findAllAppMnet();
        return parkingList;
    }
}
