package com.futurelabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> evenNumber = PrintingEvenNumbers.evenNumbersAllowed(number);
        evenNumber.forEach(System.out::println);
    }

    public static List<Integer> evenNumbersAllowed(int maxValue) {
        List<Integer> evenNumbers = new ArrayList<>();
        int skipValues = 5;
        boolean skipExternalLoop = false;
        for (int i = 1; i <= maxValue; i++) {
            if (skipExternalLoop) {
                if (skipValues == 0) {
                    skipExternalLoop = false;
                } else {
                    skipValues--;
                    continue;
                }
            }
            if (i % 2 == 0) {
                if (i == 10) {
                    skipExternalLoop = true;
                    continue;
                }
                evenNumbers.add(i);
            }
        }

        return evenNumbers;
    }
}
