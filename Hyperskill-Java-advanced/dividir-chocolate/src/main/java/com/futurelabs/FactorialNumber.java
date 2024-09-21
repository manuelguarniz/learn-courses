package com.futurelabs;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FactorialNumber {
//    public static void main(String args) throws Exception {
//        System.out.printf("No! I'm still the boss!");
//    }
//
//    public void main(String[] args) throws Exception {
//        System.out.printf("I'm the boss");
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

    public static int factorial(int number) {
        if (number <= 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static int calculateFactorial(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (x, y) -> x * y);
    }
}
