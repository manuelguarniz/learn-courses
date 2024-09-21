package com.futurelabs;

import java.util.Arrays;

public class GenericPrints {
    public static void main(String[] args) {

        System.out.println(2 + 4 * 5 - 10 / (2 + 1));

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        char[] array1 = new char[0];
        System.out.println(" -> " + array1.length);

//        char[] array2 = new char[10000000000000]; ERR

        char[] array3 = new char[1];

        char[] array4 = { 'a', 'b', 'c', 'd' };

        char[] letters = new char[] { 'A', 'B', 'C' };

        String[] words = { "first", "second", "third" };

//        double[] doubles = new { 1.0d, 1.1d, 1.2d }; ERR
//
//        int[] numbers = new int[3] { 1, 2, 3 }; ERR

        System.out.println("===============");
        int[] numbers = { 4, 5, 6 };


        method(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void method(int[] array) {
        array = new int[] { 1, 2, 3 };
    }
}
