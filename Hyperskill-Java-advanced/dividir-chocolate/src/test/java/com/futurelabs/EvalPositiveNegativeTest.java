package com.futurelabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvalPositiveNegativeTest {

    @Test
    void test_isPositive_10() {
        String expected = "1";
        String actual = EvalPositiveNegative.isPositive(10);
        assertEquals(expected, actual);
    }


    @Test
    void test_isNegative__91() {
        String expected = "-1";
        String actual = EvalPositiveNegative.isPositive(-91);
        assertEquals(expected, actual);
    }

    @Test
    void test_isNeutral_0() {
        String expected = "0";
        String actual = EvalPositiveNegative.isPositive(0);
        assertEquals(expected, actual);
    }


    @Test
    void test_isNeutral_maxlong() {
        String expected = "1";
        String actual = EvalPositiveNegative.isPositive(Long.MAX_VALUE);
        assertEquals(expected, actual);
    }
}