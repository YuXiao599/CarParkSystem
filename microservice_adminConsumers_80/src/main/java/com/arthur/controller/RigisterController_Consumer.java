package com.arthur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RigisterController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8201/";

    @RequestMapping("/RigisterController")
    public String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String userpwd = request.getParameter("userpwd");
        String phone = request.getParameter("phone");
        Map<String,String> map=new HashMap<>();
        map.put("username",username);
        map.put("userpwd",userpwd);
        map.put("phone",phone);
        return restTemplate.postForObject(REST_URL_PREFIX+"/RigisterController/",map,String.class);
    }
}
