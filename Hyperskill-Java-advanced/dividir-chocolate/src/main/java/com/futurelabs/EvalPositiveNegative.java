package com.futurelabs;

import java.util.Scanner;

public class EvalPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPositive(scanner.nextLong()));
    }

    public static String isPositive(long value) {
//        String result = value > 0 ? "1" : value < 0 ? "-1" : "0" ;
        return String.valueOf(integerCompare(value));
    }

    public static int integerCompare(long value) {
        int result = Long.compare(value, 0);
        return result;
    }
}
