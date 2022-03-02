package com.company;

public class Main {

    public static void main(String[] args) {
// Given base and n that are both 1 or more, compute recursively (no loops) the
// value of base to the n power, so powerN(3, 2) is 9 (3 squared).

System.out.println(powerUp(3));

    }

public static int powerUp (int n){

    int square;
    if (n == 1) {
        return  1;
    }
    else square = (n * ((n%2)+ powerUp(n-1)));
    return square;

}


}








