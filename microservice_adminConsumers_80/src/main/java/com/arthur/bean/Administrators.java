package com.arthur.bean;

import org.springframework.stereotype.Component;


public class Administrators {
    public Administrators(){}
    private Integer administratorid;
    private String administratorname;
    private String administratorpwd;

    public Integer getAdministratorid() {
        return administratorid;
    }

    public void setAdministratorid(Integer administratorid) {
        this.administratorid = administratorid;
    }

    public String getAdministratorname() {
        return administratorname;
    }

    public void setAdministratorname(String administratorname) {
        this.administratorname = administratorname;
    }

    public String getAdministratorpwd() {
        return administratorpwd;
    }

    public void setAdministratorpwd(String administratorpwd) {
        this.administratorpwd = administratorpwd;
    }

    @Override
    public String toString() {
        return "Administrator [administratorid=" + administratorid + ", administratorname=" + administratorname + ", administratorpwd=" + administratorpwd   + "]";
    }
}
