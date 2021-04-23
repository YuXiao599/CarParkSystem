package com.arthur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class SearchReserve_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8301/";

    @RequestMapping("/carbookManagement/find")
    public Map askforleaveList(HttpServletRequest request){
        return  restTemplate.getForObject(REST_URL_PREFIX+"/carbookManagement/find",Map.class);
    }
}
