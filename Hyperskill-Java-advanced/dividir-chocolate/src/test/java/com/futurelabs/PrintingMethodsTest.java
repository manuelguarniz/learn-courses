package com.futurelabs;

import com.futurelabs.common.Utils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintingMethodsTest {

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
    @DisplayName("la suma de los numeros del [1; 2>")
    void test_sum_num_1_2() {
        Utils.provideInput("1\n");
        Utils.provideInput("2\n");

        int result = PrintingMethods.calculateSumRangeNumbers(1, 2);
        assertEquals(1, result);
        assertEquals("1\n", outContent.toString());
    }


    @Test
    @DisplayName("la suma de los numeros del [5; 5>")
    void test_sum_num_5_5() {
        Utils.provideInput("5");
        Utils.provideInput("5");

        int result = PrintingMethods.calculateSumRangeNumbers(5, 5);
        assertEquals(0, result);
        assertEquals("0\n", outContent.toString());
    }


    @Test
    @DisplayName("la suma de los numeros del [10; 15>")
    void test_sum_num_10_15() {
        Utils.provideInput("10");
        Utils.provideInput("15");

        int result = PrintingMethods.calculateSumRangeNumbers(10, 15);
        assertEquals(60, result);
        assertEquals("60\n", outContent.toString());
    }

    @Test
    @DisplayName("test System.out")
    void test_system_out() {
        System.out.println("Hello, World!");
        assertEquals("Hello, World!\n", outContent.toString());
    }

    @Test
    @DisplayName("test Hi !")
    void test_hi() {
        Utils.provideInput("Manuel");

        String say = PrintingMethods.sayHi("Manuel");
        assertEquals(say, "Hi Manuel");
    }
}