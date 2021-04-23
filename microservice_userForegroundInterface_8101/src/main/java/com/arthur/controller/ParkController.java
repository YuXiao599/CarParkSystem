package com.arthur.controller;

import com.arthur.bean.Parking;
import com.arthur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/ParkController",method = RequestMethod.GET)
    public List<Parking> findAllPark(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Parking> parkingList=new ArrayList<>();
        parkingList=userService.findAllPark();

        return parkingList;
    }
}
