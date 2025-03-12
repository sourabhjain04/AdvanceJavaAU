package com.koenig.JunitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClaculateTest {

	Calculate calculate = new Calculate();
	
	 @Test
	    public void testSum() {
	        int result = calculate.sum(5, 3);
	        assertEquals(8, result);
	    }
	 @Test
	    public void testSumWithNegativeNumbers() {
	        int result = calculate.sum(2, -3);
	        assertEquals(-5, result);
	    }
	
	
	
}
