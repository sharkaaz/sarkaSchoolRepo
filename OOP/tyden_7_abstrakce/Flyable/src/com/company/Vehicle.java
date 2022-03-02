package com.company;

abstract class Vehicle {

private String name;
private int wheels;
private int propelers;
private boolean Xwing;

public Vehicle(String name){
    this.name = name;
}

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getPropelers() {
        return propelers;
    }

    public boolean isXwing() {
        return Xwing;
    }


}
