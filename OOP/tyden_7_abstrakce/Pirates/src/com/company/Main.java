package com.company;

public class Main {

    public static void main(String[] args) {

        Pirate pirate = new Pirate();
        Pirate pirateBadOne = new Pirate();
        pirateBadOne.drinkSomeRum();
        pirateBadOne.drinkSomeRum();
        pirateBadOne.drinkSomeRum();
        pirateBadOne.drinkSomeRum();
        pirateBadOne.howsItGoingMate();

        pirate.brawl(pirateBadOne);
        Captain captain = new Captain();
        Captain captain1 = new Captain();

        Ship cernaPerla = new Ship();
cernaPerla.fillShip();
cernaPerla.crewStatus();




    }
}
