package com.koenig.example.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	
	public int add(int a, int b) {
		return a+b;
		
	}
	
	@Test
	public void testAddition() {
		int result = add(2,3);
		Assert.assertEquals(result,5,"Addition test failed");
	}
	
	
}
