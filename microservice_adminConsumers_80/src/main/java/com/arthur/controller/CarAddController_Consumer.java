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
public class CarAddController_Consumer {

    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8201/";

    @RequestMapping("/CarAddController")
    public String CarAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carnumber =request.getParameter("carnumber");
        String carinformation = request.getParameter("carinformation");
        String userid = request.getParameter("userid");
        Map<String,String> map=new HashMap<>();
        map.put("carnumber",carnumber);
        map.put("carinformation",carinformation);
        map.put("userid",userid);
        return restTemplate.postForObject(REST_URL_PREFIX+"/CarAddController/",map,String.class);
    }
}
