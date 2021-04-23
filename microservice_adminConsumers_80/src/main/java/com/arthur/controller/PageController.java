package com.arthur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    /** 跳转至登录管理 */
    @RequestMapping("/")
    public String toLogin() {
        return "login";
    }

    /** 跳转至礼券管理 */
    @RequestMapping("/admin-gift")
    public String toGift() {
        return "admin-gift";
    }
    /** 跳转至首页 */
    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
    /** 跳转至增值服务管理 */
    @RequestMapping("/admin-car-value")
    public String toService() {
        return "admin-car-value";
    }
    /** 跳转至欢迎页 */
    @RequestMapping("/welcome")
    public String toWelcome() {
        return "welcome";
    }

    @RequestMapping("/carbookManagement")
    public String toCarbookManagement(){return "carbookManagement";}

    @RequestMapping("/carcalculationOfChargses")
    public String toCarcalculationOfChargses(){return "carcalculationOfChargses";}

    @RequestMapping("/cardetailEnquiry")
    public String toCardetailEnquiry(){return "cardetailEnquiry";}

    /** 跳转至用户页面 */
    @RequestMapping("/user")
    public String toUser() {
        return "user";
    }
    /**跳转至订单列表页面**/
    @RequestMapping("/order_list")
    public String toOrder_list() {

        return "order_list";
    }
    /**跳转至反馈页面**/
    @RequestMapping("/feedback_list")
    public String toFeedback_list() {

        return "feedback_list";
    }
    /**跳转至用户列表**/
    @RequestMapping("/user_list")
    public String toUser_list() {

        return "user_list";
    }
    /**显示用户添加**/
    @RequestMapping("/user_add")
    public String toUser_add() {

        return "user_add";
    }
    /**显示车辆添加**/
    @RequestMapping("/car_add")
    public String toCar_add() {

        return "car_add";
    }
    /** 跳转至查看停车位 */
    @RequestMapping("/member-list")
    public String toList() {
        return "member-list";
    }

    /** 跳转至停车位管理 */
    @RequestMapping("/member-add")
    public String toAdd() {
        return "member-add";
    }

    /** 跳转至停车位管理 */
    @RequestMapping("/car-away")
    public String toAway() {
        return "car-away";
    }

    /** 跳转至停车位管理 */
    @RequestMapping("/carstop")
    public String toStop() {
        return "carstop";
    }

    /** 跳转至修改车位 */
    @RequestMapping("/modifycarwei")
    public String toModify() {
        return "modifycarwei";
    }
    /** 跳转至停车记录 */
    @RequestMapping("/record")
    public String toRecord() {
        return "record";
    }

    /** 跳转至登记车牌号 */
    @RequestMapping("/carnumber")
    public String toCar() {
        return "carnumber";
    }

}
