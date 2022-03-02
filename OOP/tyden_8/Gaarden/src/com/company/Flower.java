package com.company;

public class Flower extends Plants {


    public Flower(String colour) {

        super(colour);
        this.waterAmount =0;
        this.waterAbsorb= 0.75;
    }

    @Override
    public boolean needsWater() {
        if  (this.waterAmount <= 5) {
            this.needWater = true;
        }else{
            this.needWater=false;
        }
        return this.needWater;
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void getStatus() {
        if (this.waterAmount <= 5) {
            System.out.println("The " + getColour() + " Flower needs water");
        } else  {
            System.out.println("The " + getColour() + " Flower doesn't need water");

        }
    }

    @Override
    public Double waterDose(double water) {
        waterAmount += water*waterAbsorb;
        return waterAmount;
    }
}