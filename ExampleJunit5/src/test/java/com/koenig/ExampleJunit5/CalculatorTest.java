package com.koenig.ExampleJunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void testAddition() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(5,result,"2+3 should be 5");
	}
}
