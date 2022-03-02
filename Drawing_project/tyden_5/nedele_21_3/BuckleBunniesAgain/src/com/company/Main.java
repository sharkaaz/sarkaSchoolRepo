package com.company;

public class Main {

    public static void main(String[] args) {
        // We have bunnies standing in a line,
// numbered 1, 2, 3, 4, ...
// The odd bunnies (1, 3, ...) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).
        System.out.println(myLilBunny(5));

    }

    public static int myLilBunny(int bunnies) {

        int earsNumb;
        if (bunnies <= 0) {
          return  0;}
            earsNumb = myLilBunny(bunnies-1);
        int ears;

            if (bunnies % 2 == 0) {
                ears = 3;
            }
         else { ears = 2;

        }
return earsNumb + ears;

    }
}
