package com.company;

abstract class Animal {

    private String name;
    private int age;
private boolean fluffy;

public Animal (String name){
this.name = name;

}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFluffy() {
        return fluffy;
    }
    public String breed(){

   return "How do you breed?";

    }

    public void yourCoat (){
        System.out.println("Is it nice to groom you?");

    }
}
