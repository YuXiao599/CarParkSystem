package com.arthur.bean;

public class ParkRecord {
    private int parkrecordid;
    private int carid;
    private int parkingid;
    private String parktime;
    private String intime;
    private String outtime;
    private String parkcost;
    private String carnumber;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public int getParkrecordid() {
        return parkrecordid;
    }

    public void setParkrecordid(int parkrecordid) {
        this.parkrecordid = parkrecordid;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public int getParkingid() {
        return parkingid;
    }

    public void setParkingid(int parkingid) {
        this.parkingid = parkingid;
    }

    public String getParktime() {
        return parktime;
    }

    public void setParktime(String parktime) {
        this.parktime = parktime;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime;
    }

    public String getParkcost() {
        return parkcost;
    }

    public void setParkcost(String parkcost) {
        this.parkcost = parkcost;
    }
}
