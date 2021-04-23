package com.arthur.controller;

import com.arthur.bean.Administrators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Admin_login_Consumer80 {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8501/";

    @RequestMapping("/LoginController")
    public Administrators login( HttpServletRequest request, HttpServletResponse response) throws Exception {
        String administratorname=request.getParameter("administratorname");
        String administratorpwd=request.getParameter("administratorpwd");
        Map<String,String> map=new HashMap<>();
        map.put("administratorname",administratorname);
        map.put("administratorpwd",administratorpwd);
        return restTemplate.postForObject(REST_URL_PREFIX +"/LoginController/", map, Administrators.class);
    }

}
