package com.futurelabs;

public class SearchIndex {

    public static void main(String[] args) {
        int[] array = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        System.out.println(callBinarySearch(array, 5));
    }
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        return java.util.Arrays.binarySearch(nums, key);
    }
}
