package com.futurelabs.annotation;

import java.util.Scanner;

public class BooCounter {
    public static void main(String[] args) {
        //I heard a BOO in the dark, then another boo, and finally BOO!
        // 3

        // The haunted house was quiet.
        // 0

        // Boohoo! The ghost said boo-hoo!
        // 2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int count = countBoos(input);
        System.out.println(count);
    }

    public static int countBoos(String str) {
        String regex = "[Bb][Oo][Oo]";
        return str.split(regex).length - 1;
    }
}
