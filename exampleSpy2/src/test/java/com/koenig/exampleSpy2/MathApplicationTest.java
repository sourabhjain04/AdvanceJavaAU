package com.koenig.exampleSpy2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class MathApplicationTest {

	@Spy
	private CalculatorService calcServiceSpy = new CalculatorService() {
		
		@Override
		public double add(double input1, double input2) {
			return input1+input2;
		}
		@Override
		public double subtract(double input1, double input2) {
			return input1-input2;
		}
		@Override
		public double multiply(double input1, double input2) {
			return input1*input2;
		}
		@Override
		public double divide(double input1, double input2) {
			if(input2==0)throw new ArithmeticException("Cannot divide by zero");
			
			return input1/input2;
		}
		
	};
	@InjectMocks
	private MathApplication mathApplication;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testAddWithSpy() {
		// call real method
		
		double result = mathApplication.add(10, 5);
		
		assertEquals(15.0, result);
		
		verify(calcServiceSpy).add(10,5);
	}
	
	
	@Test
	public void testMultiplyWithSpy() {
		// call real method
		
		double result = mathApplication.multiply(4,3);
		
		assertEquals(12.0, result);
		
		verify(calcServiceSpy).multiply(4,3);
	}
	
	
	@Test
	public void testDivideWithSub() {
		// call real method
		doReturn(2.0).when(calcServiceSpy).divide(10,5);
		
		double result = mathApplication.divide(10, 5);
		
		assertEquals(2.0, result);
		
		verify(calcServiceSpy).divide(10,5);
	}
	
	
}
