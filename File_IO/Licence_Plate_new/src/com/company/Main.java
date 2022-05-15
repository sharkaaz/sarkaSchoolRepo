package com.company;
import java.util.Scanner;

import static com.company.LicencePlate.findWordInLicencePlates;

public class Main {


    public static void main(String[] args) {

                String myFilePath ="src\\assets\\words.txt";

        System.out.println(findWordInLicencePlates(inputString(), myFilePath));
            }

            private static String inputString() {
                Scanner myInputScan = new Scanner(System.in);
                while (true) {
                    System.out.println("Write to console maximum 3 letters for searching word, please.");
                    try {
                        String myInputString = myInputScan.nextLine();
                        return myInputString;
                    } catch (java.util.InputMismatchException e) {
                        myInputScan.nextLine();
                    }
                }
            }
        }



