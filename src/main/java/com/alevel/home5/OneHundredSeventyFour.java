package com.alevel.home5;

import java.util.ArrayList;


public class OneHundredSeventyFour {
    public int[] function(int[] arr, int n) {
        int tmp;
        int count = 0;
        ArrayList<Integer> tmparr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                tmp = arr[i];
                boolean div = false;
                while (tmp != 0) {
                    if (arr[i] % (tmp % 10) == 0) {
                        div = true;
                        tmp /= 10;
                    } else {
                        div = false;
                        break;
                    }
                }
                if (div) {
                    tmparr.add(arr[i]);
                }
            }
        }
        int res[] = new int[tmparr.size()];
        for (int i = 0; i < tmparr.size(); i++) {
            res[i] = tmparr.get(i);
        }

        return res;
    }

}
