package com.arthur.controller;

import com.arthur.bean.Parking;
import com.arthur.bean.Parkrecord1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class ParkingRecordController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8001/";


    @RequestMapping("/car-stop/all")
    @ResponseBody
    private Map<String, Object> listAll() {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/car-stop/all",Map.class);
    }

    @RequestMapping( "/car-stop/{parkrecordid}")
    @ResponseBody
    private Map<String, Object> deleteById(@PathVariable("parkrecordid") int parkrecordid)  {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/car-stop/"+parkrecordid,Map.class);
    }

    @RequestMapping("/car-stop/carnumber")
    private Map<String, Object> updateCarnumber(@RequestBody Parkrecord1 parkrecord) {
        return  restTemplate.postForObject(REST_URL_PREFIX+"/car-stop/carnumber",parkrecord,Map.class);
    }
    @RequestMapping("/car-stop/search")
    private Map<String,Object> findByName(HttpServletRequest request, HttpServletResponse response){
        return  restTemplate.getForObject(REST_URL_PREFIX+"/car-stop/search",Map.class);
    }



}
