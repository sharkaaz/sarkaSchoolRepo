package com.company;

public class Counter {
    int counter;
    int originalValue;

    public Counter() {
    }

    public Counter(int counter) {
        this.originalValue = counter;
        this.counter = counter;
    }

    public int addNumber(int number) {
        return counter += number;
    }

    public int add() {
        return counter++;
    }

    public void get() {
        System.out.println(counter);
    }

    public int reset() {
        return counter = originalValue;
    }
}

