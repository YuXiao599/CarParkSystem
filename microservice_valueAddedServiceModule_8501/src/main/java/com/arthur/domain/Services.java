package com.arthur.domain;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Services {
    private Services(){}
    private Integer serviceid;
    private String servicename;
    private String regulation;
    private String money;
    private Date creationtime;
    private Integer administratorid;

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getRegulation() {
        return regulation;
    }

    public void setRegulation(String regulation) {
        this.regulation = regulation;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getAdministratorid() {
        return administratorid;
    }

    public void setAdministratorid(Integer administratorid) {
        this.administratorid = administratorid;
    }
    @Override
    public String toString() {
        return "Service [serviceid=" + serviceid + ", servicename=" + servicename + ", regulation=" + regulation + ", money=" + money + ", creationtime="
                + creationtime   + ", administratorid=" + administratorid   + "]";
    }
}
