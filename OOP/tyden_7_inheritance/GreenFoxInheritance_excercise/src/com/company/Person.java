package com.company;

public class Person {

private String name;
private int age;
private boolean gender;

public Person(String name, int age,boolean gender){
 this.name=name;
 this.age =age;
 this.gender = gender;
}
 public Person(){
  name = "Jane Doe";
  age =30;
  gender = false;
 }


 public String getName() {
  return name;
 }

 public boolean isGender() {
  return gender;
 }

 public int getAge() {
  return age;
 }

 public void getGoal(){
  System.out.println("My goal is: Live for the moment!");

 }
 public void introduce (){
  System.out.println("Hi, I'm " +name +" a," + age + " year old" + gender );

 }
}
