package com.company;
public class Reptiles extends Animal{

    public Reptiles(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void yourCoat() {
        System.out.println("Don't groom me!");
    }
}
