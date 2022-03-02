package com.company;

public class Zoo {

    public static void main(String[] args) {

Reptiles reptile = new Reptiles("Croc");
Mamals mamal =new Mamals("Koala");
Birds bird = new Birds("Parrot");

        System.out.println("How do you breed?");

        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
        System.out.println("A " + mamal.getName() + " is breeding by " + mamal.breed());
    }
}
