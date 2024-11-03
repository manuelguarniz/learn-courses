package com.futurelabs.basics;

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String inputInit = input.toLowerCase().replaceAll(" ", "");

        StringBuilder palindrome = new StringBuilder(inputInit);
        palindrome.reverse();

        // Implement palindrome check here
        boolean isPalindrome = inputInit.contentEquals(palindrome);

        // Print result
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}

class Inverted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder(inputString);

        // Reverse the string using StringBuilder
        sb.reverse();

        // Print the reversed string
        System.out.println(sb.toString());
    }
}

class ABD {
    public static StringBuilder createEnglishAlphabet() {
        // ASCII A -> no. 65
        // ASCII Z -> no. 90
        StringBuilder sb = new StringBuilder();
        char chr = 'A';
        while (chr <= 'Z') {
            sb.append(chr).append(" ");
            ++chr;
        }
        return sb.deleteCharAt(sb.lastIndexOf(" "));
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}

public class EmployeeManagement {
    public static String createEmail(String name, String surname) {
        return (new StringBuilder())
                .append(name)
                .append(surname)
                .append("@work.net")
                .toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        String completeEmail = createEmail(name, surname);

        System.out.println(completeEmail);
    }
}
