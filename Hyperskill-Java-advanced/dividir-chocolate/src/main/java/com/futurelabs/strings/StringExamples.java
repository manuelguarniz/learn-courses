package com.futurelabs.strings;

public class StringExamples {
    public static void main(String[] args) {
//        char[] chars = { 'H', 'Y', 'P', 'E', 'R', '-', 'S', 'K', 'I', 'L', 'L' };
//
//        String stringFromChars = String.valueOf(chars);
//
//        String[] strings = stringFromChars.split("-");
//        System.out.println(strings[1]);

        String str1 = "aaabbcccdaa";
        String str2 = " ";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
        System.out.println(str2);
    }
}
