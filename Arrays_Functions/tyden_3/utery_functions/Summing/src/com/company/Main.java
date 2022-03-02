package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
        System.out.println("Vloz libovolne CELE cislo.");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(sum(userInput));
    }

    public static Integer sum(int userInput) {
        int suma = 0;
        for (int i = 0; i < userInput; i++) {
            suma += i;
        }
        return suma;
    }
}
