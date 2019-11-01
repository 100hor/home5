package com.alevel.home5;

import org.junit.Test;

import static org.junit.Assert.*;

public class HarmonStringTest {
    private HarmonString harmonString;
    @Test
    public void sum() {
        harmonString = new HarmonString();
        HarmonString result = harmonString.sum(8);
        HarmonString expected = new HarmonString(2718, 1000);
        assertEquals(expected, result);
    }
}