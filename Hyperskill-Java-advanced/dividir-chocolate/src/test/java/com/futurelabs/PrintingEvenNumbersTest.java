package com.futurelabs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintingEvenNumbersTest {

    @Test
    @DisplayName("pares diferentes de 10 y omitir los 5 siguientes de 20")
    void test_printing_even_numbers_20() {
        List<Integer> evenNumber = PrintingEvenNumbers.evenNumbersAllowed(20);
        String expected = "2 4 6 8 16 18 20";
        String actual = String.join(" ", evenNumber.stream().map(String::valueOf).toList());
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("pares diferentes de 10 y omitir los 5 siguientes de 11")
    void test_printing_even_numbers_11() {
        List<Integer> evenNumber = PrintingEvenNumbers.evenNumbersAllowed(11);
        String expected = "2 4 6 8";
        String actual = String.join(" ", evenNumber.stream().map(String::valueOf).toList());
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("pares diferentes de 10 y omitir los 5 siguientes de 15")
    void test_printing_even_numbers_15() {
        List<Integer> evenNumber = PrintingEvenNumbers.evenNumbersAllowed(11);
        String expected = "2 4 6 8";
        String actual = String.join(" ", evenNumber.stream().map(String::valueOf).toList());
        assertEquals(expected, actual);
    }
}