package com.koenig.JunitExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ClaculateTest {

	Calculate calculate = new Calculate();
	@Before
	public void BeforeExample() {
		System.out.println("Method Running Before Every test case");
	}
	
	@After
	public void AfterExample() {
		System.out.println("Method Running After Every test case");
	}
	
	@BeforeClass
	public static void BeforeClassExample() {
		System.out.println("Method Running Before All test cases");
	}
	
	@AfterClass
	public static void AfterClassExample() {
		System.out.println("Method Running  After All test cases");
	}
	
	
	 @Test
	    public void testSum() {
		 	System.out.println("Test1");
	        int result = calculate.sum(5, 3);
	        assertEquals(8, result);
	        
	        System.out.println("--------------------------------------------");
	    }
	 @Ignore
	 @Test
	    public void testSumWithNegativeNumbers() {
		 	System.out.println("Test2");

	        int result = calculate.sum(-2, -3);
	        assertEquals(-5, result);
	    }
	
	
	
}
