package ru.job4j.array;

import static ru.job4j.array.MinDiapason.findMin;

public class SortSelected {

    public static int[] sort(int[] data) {
        int finish = data.length;
        for (int start = 0; start < finish; start++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexOf(data, min, start, data.length);
            int tmp = data[start];
            data[start] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}
