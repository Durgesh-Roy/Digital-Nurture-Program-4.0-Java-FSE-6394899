package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    void testDivision() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(5, result, "10 / 2 should equal 5");
    }

    @Test
    void testDivisionByZeroThrowsException() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
