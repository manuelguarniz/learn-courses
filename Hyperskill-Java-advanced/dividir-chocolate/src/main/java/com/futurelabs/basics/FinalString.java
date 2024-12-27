package com.futurelabs.basics;

public class FinalString {
    public static void main(String[] args) {
        final StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("!");
        System.out.println(builder);

    }
}
