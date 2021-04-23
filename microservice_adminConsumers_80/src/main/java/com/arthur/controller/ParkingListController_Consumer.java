package com.arthur.controller;

import com.arthur.bean.Parking;
import com.arthur.bean.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ParkingListController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8001/";

    @RequestMapping("/member-list/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/member-list/all",Map.class);
    }

    @RequestMapping( "/member-list/add")
    @ResponseBody
    private Map<String, Object> add(@RequestBody Parking parking) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/member-list/add",parking,Map.class);
    }

    @RequestMapping( "/member-list/{parkingid}")
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("parkingid") int parkingid) {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/member-list/"+parkingid,Map.class);
    }

    @RequestMapping("/member-list/update")
    private Map<String, Object> update(@RequestBody  Parking parking) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/member-list/update",parking,Map.class);
    }

    @RequestMapping( "/member-list/state")
    private Map<String, Object> updateState(@RequestBody  Parking parking) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/member-list/state",parking,Map.class);
    }

    @RequestMapping( "/member-list/stateout")
    private Map<String, Object> updateStateOut(@RequestBody  Parking parking) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/member-list/stateout",parking,Map.class);
    }

    @RequestMapping("/member-list/allaway")
    @ResponseBody
    private Map<String, Object> listAllAway() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/member-list/allaway",Map.class);
    }


}
