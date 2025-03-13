package com.koenig.JunitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {

    @Test
    public int testAddition() { // JUnit 4 does NOT allow this!
        int result = add(2, 3);
        assertEquals(5, result);
        return result; // JUnit 4 does NOT support return values
    }

    private int add(int a, int b) {
        return a + b;
    }
}
