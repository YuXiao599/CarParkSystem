package com.arthur.bean;

import org.springframework.stereotype.Component;


public class Gifts {
    public Gifts(){}
    private Integer giftid;
    private String giftname;
    private String giftinformation;
    private Integer giftnumber;
    private String giftscore;

    public Integer getGiftid() {
        return giftid;
    }

    public void setGiftid(Integer giftid) {
        this.giftid = giftid;
    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String giftname) {
        this.giftname = giftname;
    }

    public String getGiftinformation() {
        return giftinformation;
    }

    public void setGiftinformation(String giftinformation) {
        this.giftinformation = giftinformation;
    }

    public Integer getGiftnumber() {
        return giftnumber;
    }

    public void setGiftnumber(Integer giftnumber) {
        this.giftnumber = giftnumber;
    }

    public String getGiftscore() {
        return giftscore;
    }

    public void setGiftscore(String giftscore) {
        this.giftscore = giftscore;
    }
    @Override
    public String toString() {
        return "Gift [giftid=" + giftid + ", giftname=" + giftname + ", giftinformation=" + giftinformation + ", giftnumber=" + giftnumber + ", giftscore="
                + giftscore   + "]";
    }
}
