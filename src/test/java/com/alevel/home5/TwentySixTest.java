package com.alevel.home5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwentySixTest {
    private TwentySix obj;

    @Test
    public void minOrPlusTest() {
        obj = new TwentySix();
        int result = obj.minOrPlus(new int[]{-5, 1, -5, 1});
        int expected = -1;
        assertEquals(expected, result);
    }
}