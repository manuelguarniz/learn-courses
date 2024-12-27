package com.futurelabs.muldimentionarray;

import java.util.Scanner;

public class ArrayXSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || (i + j) == n -1) {
                    matrix[i][j] = "#";
                } else {
                    matrix[i][j] = " ";
                }
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
