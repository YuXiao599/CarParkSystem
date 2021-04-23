package com.arthur.controller;

import com.arthur.bean.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class Admin_addValue_Consumer80 {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8501/";

    @RequestMapping("/service/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/service/all",Map.class);
    }

    @RequestMapping( "/service/search")
    private Map<String, Object> findByName(HttpServletRequest request, HttpServletResponse response) {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/service/search",Map.class);
    }

    @RequestMapping( "/service/add")
    @ResponseBody
    private Map<String, Object> add(@RequestBody Services service) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/service/add",service,Map.class);
    }

    @RequestMapping( "/service/delete/{serviceid}")
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("serviceid") int serviceid) {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/service/delete/"+serviceid,Map.class);
    }

    @RequestMapping(value = "/service/update")
    private Map<String, Object> update(@RequestBody Services service) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/service/update",service,Map.class);
    }
}
