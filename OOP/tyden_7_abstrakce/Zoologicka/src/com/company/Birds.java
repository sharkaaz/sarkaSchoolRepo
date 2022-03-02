package com.company;
public class Birds extends Animal{

    public Birds(String name) {
        super(name);
    }

    @Override
    public String breed() {
       return "laying eggs.";
    }

    @Override
    public void yourCoat() {
        System.out.println("I groom by myself with my beak.");
    }
}
