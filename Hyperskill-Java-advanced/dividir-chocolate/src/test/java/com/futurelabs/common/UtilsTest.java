package com.futurelabs.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    @DisplayName("los dividores de 6")
    void test_divisors_6() {
        int expected = 6;
        Set<int[]> divisors = Utils.pairDivisors(expected);
        for (int[] elem : divisors) {
            System.out.println(elem[0] + " * " + elem[1] + " = " + expected);
            assertEquals(elem[0] * elem[1], expected);
        }
    }


    @Test
    @DisplayName("los dividores de 7")
    void test_divisors_7() {
        int expected = 7;
        Set<int[]> divisors = Utils.pairDivisors(expected);
        for (int[] elem : divisors) {
            System.out.println(elem[0] + " * " + elem[1] + " = " + expected);
            assertEquals(elem[0] * elem[1], expected);
        }
    }
}