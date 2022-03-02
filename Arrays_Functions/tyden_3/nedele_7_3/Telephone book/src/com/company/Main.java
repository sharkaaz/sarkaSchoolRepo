package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Map<String, Long> myMap = new HashMap<>();
        myMap.put("William A. Lathan", 4057091865);
        myMap.put("John K. Miller", 4022478568);
        myMap.put("Hortensia E Foster", 6064816467);
        myMap.put("Amanda D. Nowland", 3192435613);
        myMap.put("Brooke P. Askew", 3076872982);
        System.out.println("What is John K. Miller's phone number?");
        System.out.println("Whose phone number is 307-687-2982?");
        System.out.println("Do we know Chris E. Myers' phone number?");

        myTelephone(myMap);
    }

    public static void myTelephone(Map<String, Long> myMap) {
        Long number = 3076872982;
        String miller = "Brooke P. Askew";
        Long phone = 00000000000000000000;

        for (Map.Entry<String, Long> pair : myMap.entrySet()) {
            Long currentValue = pair.getValue();
            if (currentValue == number) {
                System.out.println("The number is for " + myMap.keySet().toArray()[4]);
            }
        }
        for (Map.Entry<String, Long> pair : myMap.entrySet()) {
            if (myMap.containsKey(miller)) {
                phone = pair.getValue();
            }
        }
        System.out.println("The number of John K. Miller is" + phone );
        String badKey = "Chris E. Myers";
        for (Map.Entry<String, Long> pair : myMap.entrySet()) {
            if (myMap.containsKey(badKey)) {
                System.out.println();
            } else {
            }
        }
        System.out.println("There is no Number for " + badKey + " in dictionary");
    }
}
