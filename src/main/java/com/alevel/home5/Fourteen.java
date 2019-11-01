package com.alevel.home5;

import java.util.HashMap;

public class Fourteen {
    public int losers(int []marcks){
        int cout = 0;
        for (int i = 0; i < marcks.length; i++) {
            if (marcks[i] == 2) cout++;
        }
       return cout;
    }

}
