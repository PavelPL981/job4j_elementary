package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }

        return data;
    }

    public static void main(String[] args) {
        int[] data = {5, 8, 3, 1, 9, 2};
        System.out.println(Arrays.toString(data));
    }
}
