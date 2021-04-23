package com.arthur.controller;

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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class appOneInfoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/appOneInfoController")
    public int appOneInfo(@RequestBody Map<String,String> map, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int result=0;
        request.setCharacterEncoding("UTF-8");
        Date date=new Date();
        int parkingid=Integer.parseInt(map.get("parkingid"));
        int userid=Integer.parseInt(map.get("userid"));
        String reservetime=map.get("reservetime");
        Map<String,Object> reserveInfoMap =new HashMap<>();
        reserveInfoMap.put("reserveid",date.getTime());
        reserveInfoMap.put("parkingid",parkingid);
        reserveInfoMap.put("userid",userid);
        reserveInfoMap.put("reservetime",reservetime);
        result=userService.appOneInfo(reserveInfoMap);
        return result;
    }

}
