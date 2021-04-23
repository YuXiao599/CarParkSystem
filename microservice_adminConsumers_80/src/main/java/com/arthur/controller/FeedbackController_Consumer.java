package com.arthur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class FeedbackController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8201/";

    @RequestMapping("/feedback/list")
    @ResponseBody
    private Map<String,Object> listAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/feedback/list",Map.class);
    }
}
