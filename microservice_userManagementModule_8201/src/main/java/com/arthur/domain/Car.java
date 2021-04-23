package com.arthur.domain;

import lombok.Data;

@Data
public class Car {
    private int carid;
    private String carnumber;
    private String carinformation;
    private int userid;

    public int getCarid(){
        return carid;
    }
    public void setCarid(int carid){
        this.carid=carid;
    }
    public String getCarnumber(){
        return carnumber;
    }
    public void setCarnumber(String carnumber){
        this.carnumber=carnumber;
    }
    public String getCarinformation(){
        return carinformation;
    }
    public void setCarinformation(String carinformation){
        this.carinformation=carinformation;
    }
    public Integer getUsersId() {
        return userid;
    }

    public void setUsersId(int userid) {
        this.userid = userid;
    }
}
