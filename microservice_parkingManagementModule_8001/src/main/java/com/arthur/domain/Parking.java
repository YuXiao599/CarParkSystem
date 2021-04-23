package com.arthur.domain;

import java.util.Date;

public class Parking {
    public Parking() {}
    
    private Integer parkid;
    
    private String location;

    private Integer parkingid;
    
    private String state;

    private Integer carnumber;

    private Date outtime;

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Integer getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(Integer carnumber) {
        this.carnumber = carnumber;
    }

    public Integer getParkingid() {
        return parkingid;
    }

    public void setParkingid(Integer parkingid) {
        this.parkingid = parkingid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getParkid() {
        return parkid;
    }

    public void setParkid(Integer parkid) {
        this.parkid = parkid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Parking [park=" + parkid + ", location=" + location + ", parkingid=" + parkingid + ", state=" + state + "]";
    }
}
