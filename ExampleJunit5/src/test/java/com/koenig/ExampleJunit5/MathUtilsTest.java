package com.koenig.ExampleJunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathUtilsTest {

	@ParameterizedTest
	@CsvSource({"2,4","3,9","4,16"})
	void testSquare(int input, int expected) {
		MathUtils mathUtils = new MathUtils();
		
		assertEquals(expected, mathUtils.square(input),"Square calculation is Incorrect");
	}
}
