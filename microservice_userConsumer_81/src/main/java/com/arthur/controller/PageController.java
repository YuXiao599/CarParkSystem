package com.arthur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /** 跳转至首页 */
    @RequestMapping("/")
    public String toBegin() {
        return "index";
    }

    /** 跳转至开始页 */
    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }

    /** 跳转至车位搜索 */
    @RequestMapping("/car-search-list")
    public String toCarList() {
        return "car-search-list";
    }

    /** 跳转至车位预订 */
    @RequestMapping("/car-appointment")
    public String toCarAppointment() {
        return "car-appointment";
    }

    /** 跳转至我的车辆*/
    @RequestMapping("/car-my")
    public String toMyCar() {
        return "car-my";
    }

    /** 跳转至增值服务*/
    @RequestMapping("/services-add-value")
    public String toAddValueServices() {
        return "services-add-value";
    }

    /** 跳转至兑换服务*/
    @RequestMapping("/services-exchage")
    public String toExchage() {
        return "services-exchage";
    }

    /** 跳转至意见反馈服务*/
    @RequestMapping("/services-fallback")
    public String toFallback() {
        return "services-fallback";
    }

    /** 跳转至意见反馈服务*/
    @RequestMapping("/contact")
    public String toContact() {
        return "contact";
    }

    /** 跳转至预约页面*/
    @RequestMapping("/appointment")
    public String toAppointMent(){return "appointment";}
}
