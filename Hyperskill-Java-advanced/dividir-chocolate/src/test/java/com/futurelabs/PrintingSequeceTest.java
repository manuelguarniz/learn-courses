package com.futurelabs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintingSequeceTest {

    @Test
    @DisplayName("numeros menores a 6 que no superen el 7 y omitir el 5")
    void test_sequence_numbers_less_that_7() {
        List<String> sequenceExpected = PrintingSequece.sequenceLessThatSeven(6);
        String expected = "1 2 3 4 6";
        String actual = String.join(" ", sequenceExpected);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("numeros menores a 12 que no superen el 7 y omitir el 5")
    void test_sequence_numbers_less_that_12() {
        List<String> sequenceExpected = PrintingSequece.sequenceLessThatSeven(12);
        String expected = "1 2 3 4 6 7: stopped";
        String actual = String.join(" ", sequenceExpected);
        assertEquals(expected, actual);
    }
}