package com.alevel.home5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourteenTest {
    private Fourteen list;
    @Test
    public void losersTest() {
        list = new Fourteen();
        int result = list.losers(new int[]{2, 5, 6, 4, 2, 2,});
        int expected = 3;
        assertEquals(expected, result);
    }
}