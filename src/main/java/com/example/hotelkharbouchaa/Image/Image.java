package com.example.hotelkharbouchaa.Image;

public class Image {
    private int idI;
    private String name;

    public Image(int idI, String name) {
        this.idI = idI;
        this.name = name;
    }
    public Image(String name) {
        this.name = name;
    }
    public int getIdI() {
        return idI;
    }
    public void setIdI(int idI) {
        this.idI = idI;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
