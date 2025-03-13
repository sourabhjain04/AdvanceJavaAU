package com.koenig.ExampleJunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest1 {

	@Test
	void testException() {
		Calculator2 calculator = new 		Calculator2();
		
		Assertions.assertThrows(ArithmeticException.class, ()->{
			calculator.divide(1, 0);
		});
	}
}
