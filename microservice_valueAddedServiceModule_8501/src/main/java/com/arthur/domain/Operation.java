package com.arthur.domain;


import org.springframework.stereotype.Component;

@Component
public class Operation {
    private String operationcontent;


    public String getOperationcontent() {
        return operationcontent;
    }

    public void setOperationcontent(String operationcontent) {
        this.operationcontent = operationcontent;
    }


}
