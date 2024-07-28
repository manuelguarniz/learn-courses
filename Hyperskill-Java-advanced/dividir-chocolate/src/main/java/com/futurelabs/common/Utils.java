package com.futurelabs.common;

import java.util.HashSet;
import java.util.Set;

public class Utils {

    public static Set<int[]> pairDivisors(int valor) {
        Set<int[]> result = new HashSet<>();
        for (int divisor = 1; divisor <= valor; divisor++) {
            for (int dividendo = 1; dividendo <= valor; dividendo++) {
                if (divisor * dividendo == valor) {
                    result.add(new int[]{divisor, dividendo});
                    break;
                }
            }
        }
        return result;
    }

    private Utils() {}
}
