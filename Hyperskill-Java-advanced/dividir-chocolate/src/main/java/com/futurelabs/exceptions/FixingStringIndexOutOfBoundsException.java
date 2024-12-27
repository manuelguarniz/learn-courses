package com.futurelabs.exceptions;

import java.util.Scanner;

public class FixingStringIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        if (string == null || index < 0 || index >= string.length()) {
            System.out.println("Out of bounds!");
            return;
        }

        System.out.println(string.charAt(index));
    }
}

class Test {
    public static void main(String[] args){
        String name = "My name is %c. %s ";
        String age = "My age is %d ";
        String height = "My height is %.2fm";
        System.out.println(String.format(name + age + height, 'M', "Anderson", 22, 1.53));
    }
}