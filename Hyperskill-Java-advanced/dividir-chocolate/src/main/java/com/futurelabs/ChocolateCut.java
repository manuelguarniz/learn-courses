package com.futurelabs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class ChocolateCut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = 0;
        int height = 0;
        int breakOff = 0;

        int maxInputs = 1;

        while (scanner.hasNext()) {
            String value = scanner.next();

            try {
                switch (maxInputs) {
                    case 1:
                        width = Integer.parseInt(value);
                        break;
                    case 2:
                        height = Integer.parseInt(value);
                        break;
                    default:
                        breakOff = Integer.parseInt(value);
                }

                if (maxInputs == 3) {
                    break;
                }
                maxInputs++;
            } catch (Exception e) {
                System.out.println("el numero ingresado es invalido");
            }
        }


        Set<int[]> divisors = new HashSet<>();
        for (int divisor = 1; divisor <= breakOff; divisor++) {
            for (int dividendo = 1; dividendo <= breakOff; dividendo++) {
                if (divisor * dividendo == breakOff) {
                    divisors.add(new int[]{divisor, dividendo});
                    break;
                }
            }
        }

        boolean isBreakable = false;
        for (int[] divisor : divisors) {
            if (divisor[0] <= width && divisor[1] <= height
                    && (
                    Stream.of(width, height).anyMatch(e -> e == divisor[0])
                            || Stream.of(width, height).anyMatch(e -> e == divisor[1]))
            ) {
                isBreakable = true;
            }
        }
        if (isBreakable) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
