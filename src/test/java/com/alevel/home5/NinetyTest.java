package com.alevel.home5;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NinetyTest {
    private Ninety mat;

    @Test
    public void matrixTest() {
        mat = new Ninety();
        int result[][] = mat.matrix(3);
        int expected[][] = new int[][]{{1, 0, 3}, {0, 2, 0}, {1, 0, 3}};
        assertTrue(Arrays.deepEquals(expected, result));
    }
}