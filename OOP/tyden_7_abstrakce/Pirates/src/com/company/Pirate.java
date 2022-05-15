package com.company;

import java.util.Random;

public class Pirate {

    private String name;
    private int intoxication;
    private int originalIntoxication;
    protected boolean Alive;
    private boolean Sleeping;

    public String getName() {
        return name;
    }

    public int getIntoxication() {
        return intoxication;
    }

    public int getOriginalIntoxication() {
        return originalIntoxication;
    }

    public boolean isAlive() {
        return Alive;
    }

    public boolean isSleeping() {
        return Sleeping;
    }

    public Pirate() {
        this.name = name;
        this.intoxication = 0;
        this.originalIntoxication = 0;
        this.Alive = true;
        this.Sleeping = false;
    }

    public void drinkSomeRum() {
        if (Alive = true) {
            intoxication++;
        } else {
            System.out.println("Pirate is dead or pass out already.");
        }
    }

    public void howsItGoingMate() {
        if (Alive = true) {
            if (intoxication < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                reset();
                Sleeping = true;
            }
        }else{
            System.out.println("Pirate is dead.");
        }
    }
    public int statusOfPirate (){
        if (Alive==true ){
          return 1;
        }else return 0;
    }

    public int intoxicationStatus (){
        return intoxication;
    }

    public int reset() {
        return intoxication = originalIntoxication;
    }

    public boolean die() {
        return Alive = false;
    }

    public void brawl(Pirate pirateBadOne) {
        Random random = new Random();
        int chance = random.nextInt(3);

        if (this.Sleeping == true && pirateBadOne.Sleeping == true) {
            System.out.println("Both pirates is sleeping, can't fight together!");
        } else if (this.Sleeping == true && pirateBadOne.Sleeping == false) {
            System.out.println("One pirate is sleeping, can't fight together! The active pirate woke up the sleeping pirate.");
            this.Sleeping = false;
        } else if (this.Sleeping == false && pirateBadOne.Sleeping == true) {
            System.out.println("Second pirate is sleeping, can't fight together! The active pirate woke up the sleeping pirate.");
            pirateBadOne.Sleeping = false;
        } else if (this.Sleeping == false && pirateBadOne.Sleeping == false && this.Alive == true && pirateBadOne.Alive == true && chance == 1) {
            System.out.println("Both pirates aren't sleeping, let's fight together!......Bang, bang!!! First pirate is dead");
            this.die();
        } else if (this.Sleeping == false && pirateBadOne.Sleeping == false && this.Alive == true && pirateBadOne.Alive == true && chance == 2) {
            System.out.println("Both pirates aren't sleeping, let's fight together!......Bang, bang!!! Second pirate is dead");
            pirateBadOne.die();
        } else if (this.Sleeping == false && pirateBadOne.Sleeping == false && this.Alive == true && pirateBadOne.Alive == true && chance == 3) {
            System.out.println("Both pirates aren't sleeping, let's fight together!......Other bang, other bang!!! Both pirates passed out.");
            this.Sleeping = true;
            this.reset();
            pirateBadOne.Sleeping = true;
            pirateBadOne.reset();
        } else {
            System.out.println("Both pirates are old friends, no fight today ");

        }
    }
}
