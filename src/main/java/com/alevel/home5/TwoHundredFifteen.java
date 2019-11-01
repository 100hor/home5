package com.alevel.home5;

public class TwoHundredFifteen {
    public String s;
    public int change() {
        char[] temps = s.toCharArray();
        int count = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] == ':') {
                temps[i] = ';';
                count++;
            }
        }
        s = new String(temps);
        return count;
    }
}
