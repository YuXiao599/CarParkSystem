package com.arthur.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class UserOrder {
        public UserOrder() {}

        private Integer userid;

        private Integer parkrecordid;

        private Integer carid;

        private Integer parkingid;

        private String parktime;

        public String getParktime() {
                return parktime;
        }

        public void setParktime(String parktime) {
                this.parktime = parktime;
        }


        @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
        private Date intime;
        @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
        private Date outtime;

        private Double parkcost;

        public Integer getId() {
                return userid;
        }

        public void setId(Integer userid) {
                this.userid = userid;
        }

        public Integer getParkecordid() {
                return parkrecordid;
        }

        public void setParkecordid(Integer parkecordid) {
                this.parkrecordid = parkecordid;
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

        public  Date getIntime(){
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

        public Double getParkcost() {
                return parkcost;
        }

        public void setParkcost(Double parkcost) {
                this.parkcost = parkcost;
        }
}
