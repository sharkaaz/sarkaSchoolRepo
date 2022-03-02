package com.company;

public class Shifter implements CharSequence {

    String string;
    int index;

    public Shifter (String string, int index) {
        this.string = string;
        this.index = index;

    }
public String ShiftedCharSequence (String string, int index) {
     index = index%string.length();
return string.substring(index) + string.substring(0, index);

}

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return null;
    }
}
