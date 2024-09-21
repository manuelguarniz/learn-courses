package com.futurelabs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialNumberTest {

    @Test
    @DisplayName("factorial de 0 es 1")
    void factorialZero() {
        int expected = 1;
        int actual = FactorialNumber.factorial(0);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("factorial de -5 es 1")
    void factorialNegative() {
        int expected = 1;
        int actual = FactorialNumber.factorial(-5);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("factorial de 5 es 120")
    void factorialPositive() {
        int expected = 120;
        int actual = FactorialNumber.factorial(5);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("factorial de 0 es 1")
    void factorialV2Zero() {
        int expected = 1;
        int actual = FactorialNumber.calculateFactorial(0);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("factorial de -5 es 1")
    void factorialV2Negative() {
        int expected = 1;
        int actual = FactorialNumber.calculateFactorial(-5);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("factorial de 5 es 120")
    void factorialV2Positive() {
        int expected = 120;
        int actual = FactorialNumber.calculateFactorial(5);
        assertEquals(expected, actual);
    }
}