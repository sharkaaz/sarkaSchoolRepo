package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plants> gardenbed;

    public Garden() {
        this.gardenbed = new ArrayList<>();
    }

    public void addPlant(Plants plant) {
        gardenbed.add(plant);
    }

    public Integer numberToDevided() {
        int manyPlants = 0;
        for (Plants plant : gardenbed) {
            if (plant.needsWater()) {
                manyPlants++;
            }
        }
        return manyPlants;
    }

    public void gardenStatus() {
        for (Plants flower : gardenbed) {
            if (flower instanceof Flower) {
                flower.getStatus();
            }
        }
        for (Plants tree : gardenbed) {
            if (tree instanceof Tree) {
                tree.getStatus();
            }
        }
    }

    public void watering(double water) {
        for (Plants plant : gardenbed) {
            if (plant.needsWater()) {
                plant.waterDose(water / numberToDevided());
            }
        }
        gardenStatus();
    }
}

