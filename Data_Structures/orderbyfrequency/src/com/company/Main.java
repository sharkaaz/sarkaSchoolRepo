package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> example1 = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3));
        List<Integer> example2 = new ArrayList<>(Arrays.asList(8,9,3,8,9,9,9,3,1,1));

        orderByFrequency(example2);


}
    public static void orderByFrequency(List <Integer>example)
    {
        HashMap<Integer,Integer> temporaryMap = new HashMap<>();
        for (Integer freqItem: example) {
            if (temporaryMap.containsKey(example)){
                temporaryMap.put(freqItem, temporaryMap.get(freqItem)+1);
            }
            else temporaryMap.put(freqItem, 1);
        }

        List<Integer> keysFromTempMap = new ArrayList<>(temporaryMap.keySet());
       // Collections.sort(keysFromTempMap);

        System.out.println(keysFromTempMap);

    }
}

