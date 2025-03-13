package com.koenig.ExampleJunit5;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTest {

	
	private final TestNested tn = new TestNested();
	
	
	
	 @Nested
	    class AdditionTests {
	        @Test
	        void testAddition() {
	            assertEquals(5, tn.add(2, 3), "Addition test failed");
	        }
	    }

	    @Nested
	    class SubtractionTests {
	        @Test
	        void testSubtraction() {
	            assertEquals(1, tn.subtract(3, 2), "Subtraction test failed");
	        }
	    }
}
