package com.futurelabs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintingMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        calculateSumRangeNumbers(num1, num2);
    }

    public static int calculateSumRangeNumbers(int init, int end) {
        int sum = IntStream.range(init, end).reduce(0, Integer::sum);
        System.out.println(sum);
        return sum;
    }

    public static String sayHi(String name) {
        return "Hi " + name;
    }
}
