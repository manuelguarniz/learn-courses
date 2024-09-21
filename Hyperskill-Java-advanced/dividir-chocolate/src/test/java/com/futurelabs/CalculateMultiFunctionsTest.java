package com.futurelabs;

import com.futurelabs.common.Utils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMultiFunctionsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void test_main_neg4() {
        String input = "-4\n";
        String expected = "17.0\n";
        Utils.provideInput(input);
        CalculateMultiFunctions.main(new String[]{});

        assertEquals(expected, outContent.toString());
    }


    @Test
    void test_main_0p5() {
        String input = "0.5\n";
        String expected = "4.0\n";
        Utils.provideInput(input);
        CalculateMultiFunctions.main(new String[]{});

        assertEquals(expected, outContent.toString());
    }

    @Test
    void test_calc_multi_functions_neg4() {
        Double expected = 4.0;
        Double actual = CalculateMultiFunctions.f(0.5);

        assertEquals(expected, actual);
    }

    @Test
    void test_calc_multi_functions_05() {
        Double expected = 17.0;
        Double actual = CalculateMultiFunctions.f(-4.0);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("calc: x * x + 1")
    void test_f1() {
        Double expected = 5.0;
        Double actual = CalculateMultiFunctions.f1(2.0);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("calc: 1 / (x * x)")
    void f2() {
        Double expected = 0.25;
        Double actual = CalculateMultiFunctions.f2(2.0);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("calc: (x * x) - 1")
    void f3() {
        Double expected = 3.0;
        Double actual = CalculateMultiFunctions.f3(2.0);
        assertEquals(expected, actual);
    }
}