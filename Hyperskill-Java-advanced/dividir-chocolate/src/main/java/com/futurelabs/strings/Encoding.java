package com.futurelabs.strings;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        String result = enconding(input);
        String result = encoding(input);
        System.out.println(result);
    }
    public static String encoding(String input) {
        StringBuilder out = new StringBuilder();
        var in = input.split("(?<=(.))(?!\\1)");
        for (String s : in) {
            out.append(s.charAt(0)).append(s.length());
        }
        return out.toString();
    }
    public static String enconding(String text) {
        String[] words = text.split("");
        String result = "";

        int counter = 0;
        int index = 0;
        do {
            String word = index >= words.length ? "" : words[index];
            index++;
            int lastIndex = result.length() - 1;
            if (lastIndex < 0) {
                result += word;
                counter++;
            } else if (result.substring(lastIndex).equals(word)) {
                counter++;
            } else {
                result += counter;
                counter = 0;
                result += word;
                counter++;
            }
        } while (index <= words.length);

        return result;
    }
}
