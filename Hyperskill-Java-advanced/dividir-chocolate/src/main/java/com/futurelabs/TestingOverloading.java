package com.futurelabs;

public class TestingOverloading {

    public static void method(int i, float f) {
        System.out.println("int float method");
    }

    public static void method(float f, int i) {
        System.out.println("float int method");
    }

    public static void method(int i1, int i2) {
        System.out.println("int int method");
    }

    public static void method(double d1, double d2) {
        System.out.println("double double method");
    }

    public static String toString(long num) {
        return String.format("%d", num);
    }

    public static String toString(int num) {
        return String.format("%d", num);
    }
    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }

    public static void method(char c) {
        System.out.println("char");
    }
    public static void main(String[] args) {
        method(1f, 1f);

//        float val1 = 2F; toString(val1);
        long val2 = 2L; toString(val2);
        int val3 = 2; toString(val3);
        byte val4 = 2; toString(val4);
        char val5 = 2; toString(val5);
//        double val6 = 2; toString(val6);

        method('a');
    }
}
