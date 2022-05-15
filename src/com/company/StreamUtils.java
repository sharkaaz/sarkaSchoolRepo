package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUtils {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> numbersEx5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";


         System.out.println(evenNumbers(numbers));
        System.out.println(squareNumbers(numbers));
        System.out.println(squareNumbersUpTo20(numbers));
        System.out.println(averageOdd(numbers));
        System.out.println(sumOfOdd(numbersEx5));
    }

    //Exercise 1
    //Write a method to return a list of even numbers from the list of integers below using the Stream API.
    public static List<Integer> evenNumbers(List<Integer> inputNumb) {
        return inputNumb.stream()
                .filter(numbersEx1 -> numbersEx1 % 2 == 0)
                .collect(Collectors.toList());
    }

    //Exercise 2
    //Write a method to return a list of squares of positive numbers from the list of integers below using the Stream API.
    public static List<Integer> squareNumbers(List<Integer> inputNumb) {
        return inputNumb.stream()
                .filter(numberEx2 -> numberEx2 > 0)
                .map(n -> n*n)
                .collect(Collectors.toList());
    }

//Exercise 3
    // Write a method to return a list of numbers whose square is greater than 20 from the list of integers below using the Stream API. The value 20 should be one of the method's parameters.
public static List<Integer> squareNumbersUpTo20(List<Integer> inputNumb) {
    return inputNumb.stream()
            .filter(numberEx2 -> numberEx2 > 0)
            .map(n ->  (int)Math.pow(n,2))
            .filter(n -> n>20)
            .collect(Collectors.toList());
}
//Exercise 4
//Write a method to return the average of odd numbers in the list of integers below using the Stream API. Implement this without calculating the sum first!
public static double averageOdd(List<Integer>inputNumb) {
        double expectedOutput =0;
            var sumOdd = inputNumb.stream()
            .filter(numberEx2 -> numberEx2 %2 !=0)
            .mapToDouble(n -> n.doubleValue()).sum();

            var countOdd = inputNumb.stream()
                    .filter(numberEx2 -> numberEx2 %2 !=0)
                    .mapToDouble(n -> n.doubleValue()).count();
    return expectedOutput = sumOdd/countOdd;
}
//Exercise 5
//Write a method to return the sum of odd numbers in the list of integers below using the Stream API.
public static double sumOfOdd(List<Integer>inputNumb) {
    return inputNumb.stream()
            .filter(numberEx2 -> numberEx2 % 2 != 0)
            .mapToDouble(n -> n.doubleValue()).sum();

}
//Exercise 6
//Write a method to return a list of uppercase characters from a given string using the Stream API.
public static List<Character> upperCase(String inputString) {
    return inputString.chars()
            .filter(Character::isUpperCase )
            .collect(Character.toList());

}
}
