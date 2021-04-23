package com.arthur.controller;


import com.arthur.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
        String parkingid=request.getParameter("parkingid");
        String userid=request.getParameter("userid");
        String reservetime=request.getParameter("reservetime");
        Map<String,String> map=new HashMap<>();
        map.put("parkingid",parkingid);
        map.put("userid",userid);
        map.put("reservetime",reservetime);
        return restTemplate.postForObject(REST_URL_PREFIX+"/appOneInfoController/",map,Integer.class);
    }

    @RequestMapping("/BuyServiceController")
    public String BuyServiceController(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String serviceid=request.getParameter("serviceid");
        String userid=request.getParameter("userid");
        Map<String,String> map=new HashMap<>();
        map.put("serviceid",serviceid);
        map.put("userid",userid);
        return restTemplate.postForObject(REST_URL_PREFIX+"/BuyServiceController/",map,String.class);
    }

    @RequestMapping("/FallbackController")
    public String fallback(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid=request.getParameter("userid");
        String massage=request.getParameter("massage");
        Map<String,String> map=new HashMap<>();
        map.put("userid",userid);
        map.put("massage",massage);
        String result=restTemplate.postForObject(REST_URL_PREFIX+"/FallbackController/",map,String.class);
        System.out.println(result);
        return result;
    }

    @RequestMapping("/FindAppMentCar")
    public List<Parking> FindApp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/FindAppMentCar/",List.class);
    }

    @RequestMapping("/GiftChangeController")
    public String GiftChange(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid=request.getParameter("userid");
        String giftid=request.getParameter("giftid");
        Map<String,String> map=new HashMap<>();
        map.put("userid",userid);
        map.put("giftid",giftid);
        return restTemplate.postForObject(REST_URL_PREFIX+"/GiftChangeController/",map,String.class);
    }

    @RequestMapping("/GiftController")
    public List<Gift> Gift(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return restTemplate.getForObject(REST_URL_PREFIX+"/GiftController/",List.class);
    }

    @RequestMapping("/LoginController")
    public User login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String userpwd = request.getParameter("userpwd");
        Map<String,String> map=new HashMap<>();
        map.put("username",username);
        map.put("userpwd",userpwd);
        return restTemplate.postForObject(REST_URL_PREFIX+"/LoginController/",map,User.class);
    }

    @RequestMapping("/MyCarController")
    public List<Car> CarList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String useridString=request.getParameter("userid");
        return restTemplate.postForObject(REST_URL_PREFIX+"/MyCarController/",useridString,List.class);
    }

    @RequestMapping("/RigisterController")
    public String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String userpwd = request.getParameter("userpwd");
        String phone = request.getParameter("phone");
        Map<String,String> map=new HashMap<>();
        map.put("username",username);
        map.put("userpwd",userpwd);
        map.put("phone",phone);
        return restTemplate.postForObject(REST_URL_PREFIX+"/RigisterController/",map,String.class);
    }

}
