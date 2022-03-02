package com.company;

public class Tree extends Plants {

    public Tree(String colour) {
        super(colour);
        this.waterAmount=0;
        this.waterAbsorb = 0.4;
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void getStatus() {
        if (waterAmount < 10) {
            System.out.println("The " + getColour() + " tree needs water");
        } else  {
            System.out.println("The " + getColour() + " tree doesn't need water");

    }
    }
    @Override
    public boolean needsWater() {
        if  (this.waterAmount <= 10) {
            this.needWater = true;
        }else{
            this.needWater=false;
        }
        return this.needWater;
    }

    @Override
    public Double waterDose(double water) {
        waterAmount += water*waterAbsorb;
        return waterAmount;
    }
}

