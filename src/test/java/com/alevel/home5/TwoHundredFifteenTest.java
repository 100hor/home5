package com.alevel.home5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoHundredFifteenTest {
    private TwoHundredFifteen string;
    @Test
    public void changeTest() {
        string = new TwoHundredFifteen();
        string.s = new String("f:f::");
        int expectedcount = 3;
        assertEquals(expectedcount, string.change());
        assertEquals("f;f;;", string.s);
    }
}