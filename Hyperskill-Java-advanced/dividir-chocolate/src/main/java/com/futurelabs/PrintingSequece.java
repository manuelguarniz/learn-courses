package com.futurelabs;

import java.util.ArrayList;
import java.util.List;

public class PrintingSequece {
    public static void main(String[] args) {
        //012301234401234
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }

    public static List<String> sequenceLessThatSeven(int maxValue) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= maxValue; i++) {
            if (i % 5 == 0) {
                continue;
            }
            if (i % 7 == 0) {
                list.add(i + ": stopped");
                break;
            }
            list.add(String.valueOf(i));
        }
        return list;
    }
}
