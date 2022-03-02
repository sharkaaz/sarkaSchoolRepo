package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String filePath = "assets\\python.txt";
        System.out.println(fileDecrypt(filePath));
    }

    public static Boolean fileDecrypt(String file) {
        Path filepath = Paths.get(file);
        Path newFile = Paths.get("assets\\decrypted_python.txt");
        Boolean result = false;

        try {
            List<String> fileToDecrypt = Files.readAllLines(filepath);
            List<String> decryptedFile = new ArrayList<>();
            for (String line : fileToDecrypt) {
                String newLine = "";
                char[] lineOfChars = new char[line.length()];
                for (int i = 0; i < lineOfChars.length; i++) {
                    lineOfChars[i] = line.charAt(i);
                    if (i == 0 || i % 2 == 0) newLine = newLine + lineOfChars[i];
                }
                decryptedFile.add(newLine);
            }
            Files.write(newFile, decryptedFile);
            result = true;

        } catch (IOException e) {
            System.err.println("Nelze nacist soubor.");
        }

        return result;
    }

}

