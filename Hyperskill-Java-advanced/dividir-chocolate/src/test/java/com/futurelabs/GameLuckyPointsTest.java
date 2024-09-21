package com.futurelabs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameLuckyPointsTest {


    @ParameterizedTest(name = "[{0}] vs [{1}], coinciden {3} elementos")
    @CsvSource({
            "2 4 6 2, 1 4 2 1 4, 2",
            "3 7 5, 2 5 8, 1",
    })
    void test_common_scores(String arr1, String arr2, int expected) {
        int[] array1 = Arrays.stream(arr1.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(arr2.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int actual = GameLuckyPoints.findCommonScores(array1, array2);
        assertEquals(expected, actual);
    }

}