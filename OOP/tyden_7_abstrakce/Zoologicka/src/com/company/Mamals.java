package com.company;
public class Mamals extends Animal {


    public Mamals(String name) {
        super(name);
    }

    @Override
    public String breed() {
    return "pushing miniature versions out.";
    }

    @Override
    public void yourCoat() {
        System.out.println("Groom me with brush, I love it!");
    }
}
