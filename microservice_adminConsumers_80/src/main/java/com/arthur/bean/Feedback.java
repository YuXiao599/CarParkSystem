package com.arthur.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Feedback {
    private Integer informationid;

    private String informationcontent;

    private Integer userid;
    private String username;

    private Date informationtime;

    private  String phone;

    private String informationstate;


//    public Integer getInformationid() {
//        return informationid;
//    }
//
//    public void setInformationid(Integer informationid) {
//        this.informationid = informationid;
//    }
//
//    public String getInformationcontent() {
//        return informationcontent;
//    }
//
//    public void setAccount(String informationcontent) {
//        this.informationcontent = informationcontent;
//    }
//
//    public Integer getUserid() {
//        return userid;
//    }
//
//    public void setUserid(Integer userid) {
//        this.userid = userid;
//    }
//
//    public Date getInformationtime() {
//        return informationtime;
//    }
//
//    public void setInformationtime(Date informationtime) {
//        this.informationtime = informationtime;
//    }
//
//    public String getPhone(){
//        return phone;
//    }
//
//    public void setPhone(String phone){
//        this.phone=phone;
//    }
//    @Override
//    public String toString() {
//        return "User [id=" + informationid + ", informationcontent=" + informationcontent + ", userid=" + userid + ", informationtime=" + informationtime + ", phone="
//                + phone+"]";
//    }


}
