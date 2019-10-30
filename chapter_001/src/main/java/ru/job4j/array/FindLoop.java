package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el, int start, int finish) {
        int index = -1; // если элемента нет в массиве, то возвращаем -1.
        for (; start <= finish; start++) {
            if (data[start] == el) {
                index = start;
                break;
            }
        }
        return index;
    }


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

   /* public int[] sort(int[] data) {
        int datalength = data.length;
        FindLoop find = new FindLoop();
        int index = find.indexOf(data, min, 0, data.length);
        for (int index = 0; index < datalength; index++) {

        }
        return  index;
    }

   /* public int[] sort(int[] data) {
        int i = 0;
        int count = 0;
        int datalength = data.length;
        for (; count < 20; count++) {//ограничаение максимального значения элемента массива взято условно
            for (int index = 0; index < datalength; index++) {
                if (data[index] == count && i < datalength) {
                    int tmp = data[index];
                    data[index] = data[i];
                    data[i] = tmp;
                    i++;

                }
            }
        }
        return data;


    }*/


}

