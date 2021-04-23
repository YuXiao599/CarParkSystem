package com.arthur.controller;

import com.arthur.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class UserOrderController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8201/";

    @PostMapping( "/order_list/{userid}")
    public Result selectById(@PathVariable("userid") int userid) {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/order_list/"+userid,Result.class);
    }


}
