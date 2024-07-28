package com.futurelabs;

public class SumParImpar {
    public static void main(String[] args) {
        int oddSum = 0, evenSum = 0;
        int i = 0;

        while (i/2 != 500) {
            i++;
            System.out.println("evaluate: " + i);
            if (i % 2 == 0) {
                evenSum += i;
            }
            if (i % 2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
