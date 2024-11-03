package com.futurelabs.randomtest;

import java.util.Random;

public class RandomOther {
    public static void main(String[] args) {

        Random random = new Random(100000);
        System.out.println("1: " + random.nextInt(1));
        System.out.println("2: " + random.nextInt(2));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("5: " + random.nextInt(5)); // it may print 0, 1, 2, 3, 4
        System.out.println("5: " + random.nextInt(5)); // it may print 0, 1, 2, 3, 4
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
        System.out.println("3: " + random.nextInt(3));
    }
}

class HyperskillRandom {
    public static void main(String[] args) {
        Random generator = new Random();
        int a = generator.nextInt(3);
        int b = generator.nextInt(2) + 1;
        int c = generator.nextInt(4);
        System.out.println(a + " " + b + " " + c);
    }
}