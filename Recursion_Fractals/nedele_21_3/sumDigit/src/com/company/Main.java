package com.company;

public class Main {

    public static void main(String[] args) {

   System.out.println(splitNumber(126));


    }
    public static int splitNumber (int n){
        int sumNumb;
        if (n == 0) {
         return  0;
       }

        else sumNumb = (n%10 + splitNumber(n/10));
        return sumNumb;

        }


    }



