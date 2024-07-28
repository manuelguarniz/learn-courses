package com.futurelabs;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        while (scanner.hasNextInt()) {
//            int elem = scanner.nextInt();
//            sum += elem;
//        }
//
//        System.out.println(sum);

//        int i = 5;
//        do {
//            i++;
//            System.out.print(i + " ");
//            i -= 2;
//        } while (i > 1);

        int counter = 0;
        boolean shouldBeStopped = false;

        while (!shouldBeStopped) {
            System.out.println("running");
            if (counter == 3) {
                shouldBeStopped = true;
            }
            counter++;
        }
    }
}
