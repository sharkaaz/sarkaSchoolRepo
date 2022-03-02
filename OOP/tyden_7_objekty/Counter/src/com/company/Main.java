package com.company;

public class Main {

    public static void main(String[] args) {
	Counter mycounter = new Counter();
	mycounter.add();
	mycounter.get();
	mycounter.addNumber(2);
	mycounter.get();
mycounter.reset();
mycounter.get();

Counter secondCounter = new Counter(5);
secondCounter.add();
secondCounter.get();
secondCounter.reset();
		secondCounter.get();
    }
}
