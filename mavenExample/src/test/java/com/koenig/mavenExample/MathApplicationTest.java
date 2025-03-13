package com.koenig.mavenExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.MockitoAnnotations;

public class MathApplicationTest {

    @Spy
    private CalculatorService calcServiceSpy = new CalculatorService() {
        @Override
        public double add(double input1, double input2) {
            return input1 + input2;
        }

        @Override
        public double subtract(double input1, double input2) {
            return input1 - input2;
        }

        @Override
        public double multiply(double input1, double input2) {
            return input1 * input2;
        }

        @Override
        public double divide(double input1, double input2) {
            if (input2 == 0) throw new ArithmeticException("Cannot divide by zero");
            return input1 / input2;
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
        // Call real method
        double result = mathApplication.add(10, 5);
        assertEquals(15.0, result);

        // Verify that the method was called
        verify(calcServiceSpy).add(10, 5);
    }

    @Test
    public void testMultiplyWithSpy() {
        // Spy will call the real multiply method
        double result = mathApplication.multiply(4, 3);
        assertEquals(12.0, result);

        // Verify interaction
        verify(calcServiceSpy).multiply(4, 3);
    }

    @Test
    public void testDivideWithStub() {
        // Stub the divide method to return a custom value
        doReturn(2.0).when(calcServiceSpy).divide(10, 5);

        double result = mathApplication.divide(10, 5);
        assertEquals(2.0, result);

        // Verify that the method was called
        verify(calcServiceSpy).divide(10, 5);
    }
}
