package com.koenig.exampleMokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCalculator1 {

	private Calculator c;
	
	@Mock
	private CalculatorService service;
	
	@Before
	public void setup() {
		c = new Calculator(service);
		
	}
	@Test
	public void testPerform() {
		//arrange
		when(service.add(2, 3)).thenReturn(5); //Mocking the add method
		
		// Act
		int result = c.perform(2,3);
		
		// Assert
		
		assertEquals(10, result);
		
		// Verify 
		
		verify(service).add(2,3);
		
	}
	
}
