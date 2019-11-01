package com.alevel.home5;

public class TwentySix {
    public int minOrPlus(int arr[]) {
        int plus = 0;
        int minus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) plus += arr[i];
            if (arr[i] > 0) minus += arr[i];
        }
        if(Math.abs(minus) > plus) return -1;
        else if(Math.abs(minus) < plus) return 1;
        else return 0;
    }
}
