package com.company;

public class Main {

    public static void main(String[] args) {
	//
// Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

drawPyramid(6);
    }
    public static void drawPyramid(int linCount) {

        for (int row = 1; row < (linCount + 1); row++) {

            for (int col = 1; col < (linCount * 2); col++) {
                if (row + col <= linCount || row + col >= linCount + (row * 2)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    }

