package com.week2.junit;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestAAA {

    private Calculator calculator;

    // Runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator initialized");
    }

    // Runs after each test
    @After
    public void tearDown() {
        System.out.println("Teardown: Test finished\n");
    }

    // Test for addition
    @Test
    public void testAddition() {
        // Arrange
        int a = 5, b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        System.out.println("Running testAddition()");
        assertEquals(8, result);
    }

    // Test for subtraction
    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10, b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        System.out.println("Running testSubtraction()");
        assertEquals(6, result);
    }
}
