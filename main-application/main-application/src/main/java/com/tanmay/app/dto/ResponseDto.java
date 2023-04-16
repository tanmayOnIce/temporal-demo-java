package com.tanmay.app.dto;


public class ResponseDto {

    private String fact;

    private int length;

    public void setFact(String fact) {
        this.fact = fact;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public int getLength() {
        return length;
    }
}
