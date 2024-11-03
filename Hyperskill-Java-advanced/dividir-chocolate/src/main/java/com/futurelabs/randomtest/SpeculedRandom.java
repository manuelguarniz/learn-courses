package com.futurelabs.randomtest;

import java.util.*;
import java.util.stream.IntStream;

public class SpeculedRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // in: 0 100 5 1000
        // out
        // 18
        // 270

        // in: 0 100 1000 1000
        // out:
        // 5
        // 993
        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = commands[0];
        int b = commands[1];
        int n = commands[2];
        int k = commands[3];

        int seedMin = a;
        Map<Integer, Integer> allMaxes = new HashMap<>();

        for (int seed = a; seed <= b; seed++) {
            Random random = new Random(seed);
            for (int j = 0; j < n; j++) {
                int newValue = random.nextInt(k);
                int maxValue = allMaxes.get(seed) == null || allMaxes.get(seed) < newValue ? newValue : allMaxes.get(seed);
                allMaxes.put(seed, maxValue);
            }
            if (allMaxes.get(seedMin) > allMaxes.get(seed)) {
                seedMin = seed;
            }
        }
        print(seedMin);
        print(allMaxes.get(seedMin));
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}

class SpectedRandomV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 0 100 5 1000
        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = commands[0];
        int b = commands[1];
        int n = commands[2];
        int k = commands[3];

        IntStream.range(a, b)
                .mapToObj(seed -> {
                    Random random = new Random(seed);
                    return Map.entry(seed, IntStream.range(0, n).map(j -> random.nextInt(k)).max().getAsInt());
                }).min(Map.Entry.comparingByValue()).ifPresent(e -> {
                    print(e.getKey());
                    print(e.getValue());
                });
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}