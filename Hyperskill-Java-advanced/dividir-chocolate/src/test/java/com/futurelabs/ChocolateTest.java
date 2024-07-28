package com.futurelabs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateTest {
    @Test
    @DisplayName("width: 4, height: 2, cut in: 6")
    void test_chocolate_se_puede_cortar() {
        Chocolate chocolate = new Chocolate(4, 2);
        assertEquals("YES", chocolate.cut(6));
    }

    @ParameterizedTest(name = "{0} x {1}, can divided in {2}?: {3}")
    @CsvSource({
            "4,   2,   6,  YES",
            "2,  10,   7,  NO",
            "7,   4,  21,  YES",
            "1, 100, 101,  NO"
    })
    void test_chocolate_varios_cortes(int width, int height, int divider, String expectedResult) {
        Chocolate calculator = new Chocolate(width, height);
        assertEquals(expectedResult, calculator.cut(divider),
                () -> width + "x" + height + " can divider in " + divider + ": " + expectedResult);
    }
}