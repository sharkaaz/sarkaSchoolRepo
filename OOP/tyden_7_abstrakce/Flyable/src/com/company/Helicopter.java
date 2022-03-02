package com.company;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I belive i can fly....");
    }

    @Override
    public void land() {
        System.out.println("Houston, we have a problem, i need runway to land!");
    }

    @Override
    public void takeOff() {
        System.out.println("Stewardess on board! We fly to the blue sky.");
    }

}
