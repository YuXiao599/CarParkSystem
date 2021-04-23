package com.arthur.controller;

import com.arthur.bean.ParkRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class cardetailEnquiry_Consumer80 {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8301/";

    @RequestMapping("/cardetailEnquiry/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/cardetailEnquiry/all",Map.class);
    }

    @RequestMapping("/cardetailEnquiry/update")
    @ResponseBody
    private Map<String, Object> update(@RequestBody ParkRecord parkRecord) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/cardetailEnquiry/update",parkRecord,Map.class);
    }
}
