package com.company;


import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

    public static String mostFrequentWord(String sentance) {
        String[] splitedWords = sentance.split("\\W+"); //splits by all non alphabetical characters occurring one or more times
        HashMap<String, Integer> temporaryWordCounterMap = new HashMap<>();

        for (String wordIterer : splitedWords) {
            if (temporaryWordCounterMap.containsKey(splitedWords)) {
                temporaryWordCounterMap.put(wordIterer, temporaryWordCounterMap.get(wordIterer)+1);
            } else
                temporaryWordCounterMap.put(wordIterer, 1);
        }

       String word = "";
        int manyWords = 0;
        for (Map.Entry<String, Integer> getFrequentedMap : temporaryWordCounterMap.entrySet()) {
            int currentNumbOfWords = getFrequentedMap.getValue();
            if (currentNumbOfWords > manyWords) {
                word = getFrequentedMap.getKey();
                manyWords = currentNumbOfWords;
            }
        }
        return word;
    }
}
