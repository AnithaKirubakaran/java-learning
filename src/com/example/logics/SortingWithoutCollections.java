package com.example.logics;

import java.util.Arrays;

public class SortingWithoutCollections {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 1};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
