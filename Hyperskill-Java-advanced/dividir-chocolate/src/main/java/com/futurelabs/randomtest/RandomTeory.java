package com.futurelabs.randomtest;

import java.util.Random;

public class RandomTeory {
    public static void main(String[] args) {
        // Simple RANDOM
//        Random random = new Random();
//        System.out.println(random.nextInt(5)); // it may print 0, 1, 2, 3, 4

        // Initialized RANDOM
        Random random = new Random(100000);
        System.out.println(random.nextInt(5)); // it may print 0, 1, 2, 3, 4
        System.out.println(random.nextInt(5)); // it may print 0, 1, 2, 3, 4
    }
}

class Random2 {
    public static void main(String[] args) {

        Random random = new Random(100000);
        System.out.println(random.nextInt(5)); // it may print 0, 1, 2, 3, 4
        System.out.println(random.nextInt(5)); // it may print 0, 1, 2, 3, 4
    }
}