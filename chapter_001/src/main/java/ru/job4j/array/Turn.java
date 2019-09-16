package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        double index = 0;
        int index1 = array.length;
        index = index1;
        for (int i = 0; i < index / 2; i++) {
            int tmp = array[index1 - 1];
           /*int tmp = array[i];
            array[i] = tmp1;*/
            array[index1 - 1] = array[i];
            array[i] = tmp;
            index1--;

        }
        return array;
    }
}