package com.arthur.bean;

import javax.xml.crypto.Data;

public class Search {
private Data intime;
private Data reservetime;
private String carnumber;
private String location;
private String end_time;
private String start_time;

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Data getData() {
        return intime;
    }

    public void setData(Data intime) {
        this.intime = intime;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
}
