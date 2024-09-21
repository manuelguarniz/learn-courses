package com.futurelabs;

import java.util.*;
import java.util.stream.Collectors;

public class GameLuckyPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two integers n and m – the number of scores in each set
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Take two arrays a and b – the score sets
        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        int commonScores = findCommonScores(a, b);

        // Print out the number of common scores
        System.out.println(commonScores);
    }

    public static int findCommonScores(int[] array1, int[] array2) {
        int commonScore = 0;
        Set<Integer> cleanArray1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> cleanArray2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        for (int i : cleanArray1) {
            for (int j : cleanArray2) {
                if (i == j) {
                    commonScore++;
                }
            }
        }
        return commonScore;
    }
}
