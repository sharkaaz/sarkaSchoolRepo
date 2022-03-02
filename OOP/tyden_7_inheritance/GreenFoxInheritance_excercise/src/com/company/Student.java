package com.company;

public class Student extends Person {

private String PreviousOrganization;
private int skippedDays = 0;

public Student(String name, int age, boolean gender,String PreviouseOrganization, int skippedDays) {
    super(name, age, gender);
    this.PreviousOrganization = PreviouseOrganization;
    this.skippedDays = skippedDays;
}

 public Student(){
    PreviousOrganization = "The School of Life.";
     this.skippedDays = skippedDays;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm" +getName() + " a," +getAge() +"year old" + isGender() + " from " + PreviousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays (int numberOfDays){
    return skippedDays =+ numberOfDays;
    }
}
