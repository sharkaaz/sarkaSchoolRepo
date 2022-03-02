package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        int count = countlines("src/com/company/fileName");
        System.out.println(count);

    }

    private static int countlines(String fileName) {
        int count = 0;
        Path filePath = Paths.get(fileName);
        try {


            List<String> lines = Files.readAllLines(filePath);
            count = lines.size();
        } catch (IOException e) {
            return 0;
        }

        return count;
    }
}
