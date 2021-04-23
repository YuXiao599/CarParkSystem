package com.arthur.controller;


import com.arthur.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@RestController
public class UserController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8101/";

    @RequestMapping(value = "/FindParking")
    public List<Parking> findAllPark(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/ParkController/",List.class);
    }

    @RequestMapping("/AddValueController")
    public List<AddValue> AddValue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/AddValueController/",List.class);
    }

    @RequestMapping("/appOneInfoController")
    public int appOneInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/appOneInfoController/",Integer.class);
    }

    @RequestMapping("/BuyServiceController")
    public String BuyServiceController(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/BuyServiceController/",String.class);
    }

    @RequestMapping("/FallbackController")
    public User fallback(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/FallbackController/",User.class);
    }

    @RequestMapping("/FindAppMentCar")
    public List<Parking> FindApp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/FindAppMentCar/",List.class);
    }

    @RequestMapping("/GiftChangeController")
    public String GiftChange(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/GiftChangeController/",String.class);
    }

    @RequestMapping("/GiftController")
    public List<Gift> Gift(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/GiftController/",List.class);
    }

    @RequestMapping("/LoginController")
    public User login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/LoginController/",User.class);
    }

    @RequestMapping("/MyCarController")
    public List<Car> CarList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/MyCarController/",List.class);
    }

    @RequestMapping("/RigisterController")
    public String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/RigisterController/",String.class);
    }

}
