package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej cele cislo.");

        int num = scanner.nextInt();

        try {
            int result = 10 / num;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Nelze delit nulou!");


        }
    }
}

