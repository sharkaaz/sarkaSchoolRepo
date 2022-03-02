package com.company;

public abstract class Plants {

 protected   String colour;
protected double waterAmount;
protected double waterAbsorb;
protected boolean needWater;

    public Plants(String colour) {
        this.colour = colour;
    }

    public void getStatus(){
    }
    public String getColour() {
        return colour;
    }

    public Double waterDose(double water){
        return null;
    }

    public boolean needsWater (){
        return needWater;
    }
}

