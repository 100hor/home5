package com.alevel.home5;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneHundredSeventyFourTest {
    private OneHundredSeventyFour obj;

    @Test
    public void function() {
        obj = new OneHundredSeventyFour();
        int [] result = obj.function(new int[]{315, 557, 111, 858, 244, 945}, 900 );
        int[] expected = new int[]{315, 111, 244};
        assertArrayEquals(expected, result);
    }
}