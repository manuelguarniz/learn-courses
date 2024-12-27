package com.futurelabs.muldimentionarray;

public class MArraysExample {
    public static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            int[] newRow = twoDimArray[i].clone();

            int reorderColIndex = 0;
            for (int j = newRow.length - 1; j >= 0; j--) {
                twoDimArray[i][reorderColIndex] = newRow[j];
                reorderColIndex++;
            }
        }
    }

    public static void reverseElementsInteresting(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0, k = arr[i].length - 1; j < k; j++, k--) {
                arr[i][j] ^= arr[i][k];
                arr[i][k] ^= arr[i][j];
                arr[i][j] ^= arr[i][k];
            }
        }
    }

    public static void reverseElementsHardcode(int[][] twoDimArray) {
        int[][] newTwoDimArray = new int[twoDimArray.length][twoDimArray[0].length];

        for (int i = 0; i < twoDimArray.length; i++) {
            int reorderColIndex = 0;
            for (int j = twoDimArray[i].length - 1; j >= 0; j--) {
                newTwoDimArray[i][reorderColIndex] = twoDimArray[i][j];
                reorderColIndex++;
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = newTwoDimArray[i][j];
            }
        }
    }
    public static void reverseElementsAll(int[][] twoDimArray) {
        int[][] newTwoDimArray = new int[twoDimArray.length][twoDimArray[0].length];
        int reorderRowIndex = 0;

        for (int i = twoDimArray.length - 1; i >= 0; i--) {
            int reorderColIndex = 0;
            for (int j = twoDimArray[i].length - 1; j >= 0; j--) {
                newTwoDimArray[reorderRowIndex][reorderColIndex] = twoDimArray[i][j];
                reorderColIndex++;
            }
            reorderRowIndex++;
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = newTwoDimArray[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 9, 9 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        reverseElements(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        0 0 9 9              9 9 0 0
//        1 2 3 4 will become: 4 3 2 1
//        5 6 7 8              8 7 6 5


        System.out.println("====");
        int a = 1; // a = 0001 / 1
        int b = 4; // b = 0100 / 4
        a ^= b; // a = 0101 / 5
        b ^= a; // b = 0001 / 1
        a ^= b; // a = 0011 / 4
        System.out.println("result: a=" + a);
        System.out.println("result: b=" + b);
    }
}
