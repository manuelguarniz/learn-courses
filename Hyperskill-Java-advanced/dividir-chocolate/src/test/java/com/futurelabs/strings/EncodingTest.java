package com.futurelabs.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {
    @Test
    @DisplayName("encoding: aaaabbcaa / result: a4b2c1a2")
    void testEncoding1() {
        String input = "aaaabbcaa";
        String expected = "a4b2c1a2";

        String result = Encoding.enconding(input);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("encoding: abc / result: a1b1c1")
    void testEncoding2() {
        String input = "abc";
        String expected = "a1b1c1";

        String result = Encoding.enconding(input);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("encoding: aaaaa / result: a5")
    void testEncoding3() {
        String input = "aaaaa";
        String expected = "a5";

        String result = Encoding.enconding(input);
        assertEquals(expected, result);
    }
}