package com.company;

public class Gnirts implements CharSequence {


    String string;

    public Gnirts(String string) {
        this.string = string;
    }



    @Override
    public int length() {

        return 0;
    }

    @Override
    public char charAt(int index) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.charAt(index);

    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}