package com.arthur.controller;


import com.arthur.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@RestController
public class Admin_gift_Consumer80 {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8501/";

    @RequestMapping(value = "/gift/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/gift/all",Map.class);
    }

    @RequestMapping(value = "/gift/search")
    @ResponseBody
    private Map<String, Object> findByName(HttpServletRequest request, HttpServletResponse response) {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/gift/search",Map.class);
    }

    @RequestMapping(value = "/gift/add")
    @ResponseBody
    private Map<String, Object> add(@RequestBody Gifts gift) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/gift/add",gift,Map.class);
    }

    @RequestMapping(value = "/gift/delete/{giftid}")
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("giftid") int giftid) {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/gift/delete/"+giftid,Map.class);
    }

    @RequestMapping(value = "/gift/update")
    @ResponseBody
    private Map<String, Object> update(@RequestBody Gifts gift) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/gift/update",gift,Map.class);
    }

}
