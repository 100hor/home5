package com.alevel.home5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FiftySevenTest {

    private FiftySeven arr;

    @Test
    public void killTheSameTest() {
        arr = new FiftySeven();
        int[] expected = new int[]{1, 2, 5, 6};
        assertArrayEquals(expected, arr.killTheSame(new int[]{1, 2, 2, 5, 6, 5, 1}));
    }
}