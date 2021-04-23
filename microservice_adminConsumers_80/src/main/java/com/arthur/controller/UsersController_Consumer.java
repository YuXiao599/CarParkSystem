package com.arthur.controller;

import com.arthur.bean.Result;
import com.arthur.bean.Services;
import com.arthur.bean.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class UsersController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8201/";

    @RequestMapping( "/users/{userId}")

    public Result deleteById(@PathVariable("userId")int userId) {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/users/"+userId,Result.class);
    }

//    @RequestMapping( "/users/{userId}")
//
//    public Result getOne(@PathVariable("userId")int userId){
//        return  restTemplate.getForObject(REST_URL_PREFIX+"/users/"+userId,Result.class);
//    }

    @RequestMapping("/users/update")
    public Result update(@RequestBody Users users) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/users/update",users,Result.class);
    }

    @RequestMapping("/users/list")
    @ResponseBody
    private Map<String, Object> listAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/users/list",Map.class);
    }

}
