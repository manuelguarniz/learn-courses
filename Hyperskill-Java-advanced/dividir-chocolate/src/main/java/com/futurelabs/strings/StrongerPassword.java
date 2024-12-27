package com.futurelabs.strings;

import java.util.*;

public class StrongerPassword {
    public static void main(String[] args) {
//        char a = 164; // 97 a - 122 z
//        for (char b = 'a'; b <= 'z'; b++) {
//            System.out.println(a);
//        }
        String[] tests = {
                "1 0 0 1",
                "0 1 0 1",
                "0 0 0 1",
                "1 0 0 2",
                "1 1 1 3",
                "2 2 2 6",
                "2 2 2 8",
                "3 2 3 10",
                "0 0 0 100",
                "100 0 0 100",
                "0 100 0 100",
                "0 0 100 100",
                "33 33 33 100",
        };
        for (String test : tests) {
            int[] paramsValue = Arrays.stream(test.split(" ")).mapToInt(Integer::parseInt).toArray();

            int a = paramsValue[0];
            int b = paramsValue[1];
            int c = paramsValue[2];
            int n = paramsValue[3];
            String strongerPassword = strongerPassword(a, b, c, n);
            System.out.println("✅ " + test + ": (" + isContainRepeatSequenceCharacters(strongerPassword) + ") " + strongerPassword);
        }
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int n = scanner.nextInt();
//        String strongerPassword = strongerPassword(a, b, c, n);
//        System.out.println(strongerPassword);
    }

    public static String strongerPassword(int a, int b, int c, int n) {

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String allCharacters = uppercase + lowercase + digits;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        while (password.length() < n) {
            if (a == 0 && b == 0 && c == 0) {
                password.append(generateRandomCharacters(allCharacters, n, random));
            } else {
                password.append(generateRandomCharacters(uppercase, a, random));
                password.append(generateRandomCharacters(lowercase, b, random));
                password.append(generateRandomCharacters(digits, c, random));
            }
        }

        StringBuilder finalPassword = new StringBuilder();
        String previousLetter = null;

        for (String letter : password.toString().split("")) {
            if (letter.equalsIgnoreCase(previousLetter)) {
                Set<String> usedCharacters = new HashSet<>();
                usedCharacters.add(previousLetter.toLowerCase());
                usedCharacters.add(letter.toLowerCase());

                String replacement;

                String characterList = digits;
                characterList = characterList.contains(letter) ? characterList : uppercase;
                characterList = characterList.contains(letter) ? characterList : lowercase;

                do {
                    replacement = String.valueOf(characterList.charAt(random.nextInt(characterList.length())));
                } while (usedCharacters.contains(replacement.toLowerCase()));

                finalPassword.append(replacement);
                previousLetter = replacement;
            } else {
                finalPassword.append(letter);
                previousLetter = letter;
            }
        }

        System.out.println(String.format("⏰ %s %s %s %s: (%s) %s", a, b, c, n, isContainRepeatSequenceCharacters(password.toString()), password.substring(0, n)));
        return finalPassword.substring(0, n);
    }

    private static String generateRandomCharacters(String source, int count, Random random) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(source.charAt(random.nextInt(source.length())));
        }
        return result.toString();
    }

    public static String isContainRepeatSequenceCharacters(String text) {
        String previousChar = null;
        for (String currentChar : text.split("")) {
            if (currentChar.equalsIgnoreCase(previousChar)) {
                return previousChar;
            } else {
                previousChar = currentChar;
            }
        }
        return "";
    }

    public static String strongerPasswordOK(String params) {
        int[] paramsValue = Arrays.stream(params.split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = paramsValue[0];
        int b = paramsValue[1];
        int c = paramsValue[2];
        int n = paramsValue[3];
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < n; i++) {
            password.append((char) (i % 2 + (i < a ? 'A' : i < a + b ? 'a' : '0')));
        }
        return password.toString();
    }

}
