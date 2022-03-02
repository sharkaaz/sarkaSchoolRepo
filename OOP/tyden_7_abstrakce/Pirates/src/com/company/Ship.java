package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
    ArrayList<Pirate> crew;

    public Ship() {
        this.crew = new ArrayList<>();
    }


    public void fillShip() {
        crew.add(new Captain());
        Random random = new Random();
        int pirateAmount = random.nextInt(113);
        for (int i = 0; i < 1 + pirateAmount; i++) {
            crew.add(new Pirate());
        }
    }

    public int crewStatus() {
        int status = 0;
        int alivecpt = 0;
        for (int i = 0; i < crew.size(); i++) {

            status += crew.get(i).statusOfPirate();
        }
        for (int i = 0; i < crew.size(); i++) {

            if (crew.get(i) instanceof Captain && ((Captain) crew.get(i)).Alive == true) {
                System.out.println("Captain is alive and dink " + ((Captain) crew.get(i)).intoxicationStatus() + " glasses of rum.");
            } else if (crew.get(i) instanceof Captain && ((Captain) crew.get(i)).Alive == false) {
                System.out.println("Captain is dead.");
            }
        }
        System.out.println("Number of alive pirates: " + status);
        return status;
    }


   /* public void addPirate(Pirate pirate)
    {
        if (pirate instanceof Captain) {
            for (Pirate currPirate : crew) {
                if (currPirate instanceof Captain) {
                    return;
                }
            }
        }
        crew.add(pirate);
    }*/


}


