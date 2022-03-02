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
        System.out.println(reverseMethod(filePath));

    }
public static Boolean reverseMethod (String file){
      Path filepath = Paths.get(file);
      Path newFile = Paths.get("assets\\decrypted_reversed.txt");
      Boolean result = false;

      try {
          List<String> reversedFiles = Files.readAllLines(filepath);
          List<String> rightRowsFiles = new ArrayList<>();
          for (String lines: reversedFiles) {
            char [] arrChar = new char [lines.length()];
            char [] rightarrChar = new char [lines.length()];
            arrChar = lines.toCharArray();
              for (int i = 0; i < lines.length(); i++) {
                  String rightRows = new String (rightarrChar);
                  rightRowsFiles.add(rightRows);
                  Files.write(newFile, rightRowsFiles);
                  result = true;
              }
          }
      }catch (IOException e){
          System.err.println("Nelze nacist soubor.");
      }
      return result;


}



}
