package com.company;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();
Flower flower = new Flower("yellow");
        Flower flowerbe = new Flower("blue");
        Tree tree = new Tree("orange");
        Tree treebe = new Tree("purple");

        garden.addPlant(flower);
        garden.addPlant(flowerbe);
        garden.addPlant(tree);
        garden.addPlant(treebe);

        garden.gardenStatus();
        garden.watering(40);
        garden.watering(70);

    }
}
