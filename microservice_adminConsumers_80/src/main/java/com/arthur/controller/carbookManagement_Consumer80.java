package com.arthur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class carbookManagement_Consumer80 {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8301/";

    @RequestMapping("/carbookManagement/all")
    @ResponseBody
    private Map<String, Object> listAllReserve() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/carbookManagement/all",Map.class);
    }

}
