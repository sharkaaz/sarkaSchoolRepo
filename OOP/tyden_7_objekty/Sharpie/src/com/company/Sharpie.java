package com.company;

public class Sharpie {
    String colour;
    float width;
    float inkAmount = 100;
    public Sharpie(String colour, float width){
        this.colour = colour;
        this.width = width;
    }
    public void use() {
        this.inkAmount = inkAmount - 10;
    }
}
