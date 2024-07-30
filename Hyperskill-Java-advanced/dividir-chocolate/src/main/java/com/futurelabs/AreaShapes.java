package com.futurelabs;

import java.util.Scanner;

public class AreaShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        switch (shape) {
            case "rectangle":
                getValuesSquare(scanner);
                break;
            case "circle":
                getValuesCircle(scanner);
                break;
            case "triangle":
                getValuesTriangle(scanner);
                break;
            default:
                System.out.println("Invalid shape");
        }
    }

    public static void getValuesSquare(Scanner scanner) {
        int counterInput = 0;
        double width = 0.0;
        double height = 0.0;

        while (scanner.hasNext()) {
            switch (counterInput) {
                case 0:
                    width = scanner.nextDouble();
                    counterInput++;
                    break;
                case 1:
                    height = scanner.nextDouble();
                    counterInput++;
                    break;
            }
            if (counterInput == 2) {
                break;
            }
        }

        Double area = calculateAreaSquare(width, height);
        System.out.println(area);
    }

    public static void getValuesTriangle(Scanner scanner) {
        int counterInput = 0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        while (scanner.hasNext()) {
            switch (counterInput) {
                case 0:
                    a = scanner.nextDouble();
                    counterInput++;
                    break;
                case 1:
                    b = scanner.nextDouble();
                    counterInput++;
                    break;
                case 2:
                    c = scanner.nextDouble();
                    counterInput++;
                    break;
            }
            if (counterInput == 3) {
                break;
            }
        }

        Double area = calculateAreaTriangle(a, b, c);
        System.out.println(area);
    }

    public static void getValuesCircle(Scanner scanner) {
//        int counterInput = 0;
        double radius = scanner.nextDouble();

//        while (scanner.hasNext()) {
//            switch (counterInput) {
//                case 0:
//                    a = scanner.nextDouble();
//                    counterInput++;
//                    break;
//                case 1:
//                    b = scanner.nextDouble();
//                    counterInput++;
//                    break;
//                case 2:
//                    c = scanner.nextDouble();
//                    counterInput++;
//                    break;
//            }
//            if (counterInput == 3) {
//                break;
//            }
//        }

        Double area = calculateAreaCircle(radius);
        System.out.println(area);
    }

    public static Double calculateAreaSquare(Double width, Double height) {
        return width * height;
    }


    public static Double calculateAreaTriangle(Double a, Double b, Double c) {
        Double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter*(semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public static Double calculateAreaCircle(Double radius) {
        Double pi = 3.14;
        return pi * radius * radius;
    }
}
