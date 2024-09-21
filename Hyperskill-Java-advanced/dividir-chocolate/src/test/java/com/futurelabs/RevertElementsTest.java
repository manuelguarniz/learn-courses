package com.futurelabs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RevertElementsTest {

    @Test
    void testRotate1() {
        int[] spec = new int[] { 5, 1, 2, 3, 4 };
        int[] actual = RevertElements.rotate(new int[] { 1, 2, 3, 4, 5 }, 1);
        Arrays.stream(spec).forEach(System.out::print);
        System.out.println();
        Arrays.stream(actual).forEach(System.out::print);
        System.out.println();
        assertArrayEquals(spec, actual);
    }

    @Test
    void testRotate2() {
        int[] spec = new int[] { 4, 5, 1, 2, 3 };
        int[] actual = RevertElements.rotate(new int[] { 1, 2, 3, 4, 5 }, 2);

        assertArrayEquals(spec, actual);
    }

    @Test
    void testRotate8() {
        int[] spec = new int[] { 3, 4, 5, 1, 2 };
        int[] actual = RevertElements.rotate(new int[] { 1, 2, 3, 4, 5 }, 8);

        assertArrayEquals(spec, actual);
    }

    @Test
    void testRotate4() {
        int[] spec = new int[] { 41, 51, 78, 90, 11, 21, 1 };
        int[] actual = RevertElements.rotate(new int[] { 11, 21, 1, 41, 51, 78, 90 }, 4);

        assertArrayEquals(spec, actual);
    }
}