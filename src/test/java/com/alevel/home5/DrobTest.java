package com.alevel.home5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrobTest {


    public Drob drob;// 0.5 0.6 0.57 0.88

    @Test
    public void sortMassDrobTest() {
        Drob [] result = drob.sortMassDrob(new Drob[]{new Drob(1,2), new Drob(3,5), new Drob(4,7),new Drob(8,9)});
        Drob [] expexted = new Drob[]{ new Drob(1,2), new Drob(4,7), new Drob(3,5), new Drob(8,9)};
        assertArrayEquals(expexted, result);
    }

}