package com.futurelabs;

import java.util.Locale;
import java.util.Scanner;

public class TestScannerDouble {
    public static void main(String[] args) {
//        printSetLocale();
//        divider1();
//        divider2();

//        Scanner scanner = new Scanner(System.in);
//        print(scannerAndMultiplier(scanner.nextDouble()));
//        cubeRoot();


        double a = 3.2, b = 10.5;
        double result = Math.round(a / b * 1e10) / 1e10;
        System.out.printf("%.10f\n", result);
        double a1 = 10.5, b1 = 3.2;
        double result1 = Math.round(a1 / b1 * 1e10) / 1e10;
        System.out.printf("%.10f\n", result1);
        System.out.println(1e10);
    }

    private static void cubeRoot() {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double result = Math.pow(number, (double) 1/3);
        System.out.println(result);

    }

    public static double liquidPressure(double density, double height) {
        return density * height * 9.8;
    }

    public static double scannerAndMultiplier(double x) {
        return Math.pow(x, 3) + Math.pow(x, 2) + Math.pow(x, 1) + 1;
    }

    private static void divider2() {
        double a = 8;
        double b = 5;
        double c = a / b + 1.1;
        print(c);
    }

    private static void divider1() {
        int a = 12;
        int b = 5;
        int c = 2;

        double d = c * (a / b);
        print(d);
    }

    private static void printSetLocale() {
//        Scanner scanner = new Scanner(System.in); // default format (, or .)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // english format: punto (.)
        System.out.println("Enter an double: ");
        double number = scanner.nextDouble();
        System.out.println("double is: " + number);
        scanner.close();
    }
    private static void print(String value) {
        System.out.println(value);
    }
    private static void print(Double value) {
        System.out.println(value);
    }
    private static void print(Integer value) {
        System.out.println(value);
    }
    private static void print(float value) {
        System.out.println(value);
    }
    private static void print(Boolean value) {
        System.out.println(value);
    }
}
