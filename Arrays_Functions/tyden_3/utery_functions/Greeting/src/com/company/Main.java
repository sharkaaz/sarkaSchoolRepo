package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your original greetings, be creative!");
       String greets = scanner.nextLine();
        System.out.println(greet(greets));
    }
    public static String greet (String greets){
        String al = "Green Fox";
    greets += " "+al;
        return greets;
    }
}

