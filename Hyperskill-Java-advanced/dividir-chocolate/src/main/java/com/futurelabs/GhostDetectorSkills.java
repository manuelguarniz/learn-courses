package com.futurelabs;

import java.util.Scanner;

class HouseGhost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int totalGhosts = 0;

        for (int i = 1; i <= N; i++) {
            totalGhosts += (i * i);
        }

        System.out.println(totalGhosts);
        scanner.close();
    }
}

class CounterCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCandy = 0;
        int pieces;
        pieces = Integer.parseInt(scanner.nextLine());

        while (pieces != 0) {
            totalCandy+=pieces;
            pieces = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Total candy collected: " + totalCandy);
    }
}

public class GhostDetectorSkills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        boolean isDark = Boolean.parseBoolean(scanner.nextLine());
        boolean isCold = Boolean.parseBoolean(scanner.nextLine());
        boolean isNoisy = Boolean.parseBoolean(scanner.nextLine());

        // Implement ghost detector logic here
        boolean isDetectorActivated = isDark && (isCold || isNoisy);

        // Output the result
        System.out.println(String.valueOf(isDetectorActivated));

        scanner.close();
    }
}
