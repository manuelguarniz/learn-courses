package com.futurelabs;

public class ForContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
