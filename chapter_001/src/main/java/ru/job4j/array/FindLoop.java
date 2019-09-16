package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        int datalength = data.length;//добавил метод для замены предыдущией константы длины массива
        for (int index = 0; index < datalength; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}