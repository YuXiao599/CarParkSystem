package com.arthur.bean;

import java.util.Date;

public class Parkrecord1 {
    private Integer parkrecordid;
    private Integer carid;
    private Integer parkingid;
    private Date intime;
    private Date outtime;
    private Integer carnumber;
    public Integer getCarnumber() {
        return carnumber;
    }
    public void setCarnumber(Integer carnumber) {
        this.carnumber = carnumber;
    }
    public Integer getParkrecordid() {
        return parkrecordid;
    }

    public void setParkrecordid(Integer parkrecordid) {
        this.parkrecordid = parkrecordid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getParkingid() {
        return parkingid;
    }

    public void setParkingid(Integer parkingid) {
        this.parkingid = parkingid;
    }


    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

}
