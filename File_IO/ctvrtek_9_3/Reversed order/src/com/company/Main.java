package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String filePath = "assets\\reversed.txt";
        System.out.println(orderMethod(filePath));
    }

    public static Boolean orderMethod(String file) {

        Path filepath = Paths.get(file);
        Path newFile = Paths.get("assets\\flip_over.txt");
        Boolean result = false;

        try {
            List<String> origFile = Files.readAllLines(filepath);
            List<String> rightOrderFile = new ArrayList<>();
            for (int i = origFile.size()-1;i>-1; i--) {
                rightOrderFile.add(origFile.get(i));

            }
            Files.write(newFile,rightOrderFile);
            result= true;
        } catch (IOException e) {
            System.err.println("Nelze nacist soubor.");
        }
        return result;
    }

}
