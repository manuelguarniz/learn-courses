package com.futurelabs.mathtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisor {
    public static void main(String[] args) {
        List<String> allData = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        int totalElements = allData.size();
        int maxElementsPerPage = 5;
        int offset = 0;

        System.out.println("totalPages: " + totalPages(totalElements, maxElementsPerPage));
        System.out.println("currentPage: " + currentPage(offset, maxElementsPerPage));

        System.out.println("----- list ----");
        for (String s : elementsPerPage(allData, offset, maxElementsPerPage)) {
            System.out.println(s);
        }
    }

    private static int currentPage(int offset, int maxElementsPerPage) {
        if (offset == 0 || maxElementsPerPage == 0 || offset < maxElementsPerPage) {
            return 1;
        }
        return (offset / maxElementsPerPage) + 1;
    }

    public static int totalPages(int totalElements, int maxElementsPerPage) {
        return (int) Math.ceil(totalElements / (double) maxElementsPerPage);
    }

    private static List<String> elementsPerPage(List<String> allData, int offset, int maxElementsPerPage) {
        int endIndex = offset + maxElementsPerPage;
        if (offset > allData.size()) {
            return new ArrayList<>();
        }
        if (offset + maxElementsPerPage > allData.size()) {
            endIndex = allData.size();
        }
        List<String> dataPaginated = allData.subList(offset, endIndex);
        return dataPaginated;
    }
}
