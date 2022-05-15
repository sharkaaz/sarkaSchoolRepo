package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;



public class LicencePlate {


    public static ArrayList<String> findWordInLicencePlates(String inputString,String fileName){
        Path filePath = Paths.get(fileName);
        ArrayList<String> outputFilesWords = new ArrayList<>();
        StringBuilder splitInputString = new StringBuilder(inputString);
        String firstLetter = splitInputString.substring(0,1);


        try {
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(filePath);
            for (String word : lines) {
                String[] splitFinal = word.split("\\s+");

                for (String matchWord: splitFinal) {

                    if (matchWord.contains(splitInputString)||matchWord.substring(0,1)==firstLetter&&matchWord.contains(splitInputString.substring(1))){
                        outputFilesWords.add(matchWord);
                    }
                    }

            }
        } catch (IOException e){
            System.err.println("Your file cannot be read by program, sorry! :(");
        }if(outputFilesWords.size()==0){
            System.err.println("No words contains your input.");
        }
        return outputFilesWords;
    }
}
