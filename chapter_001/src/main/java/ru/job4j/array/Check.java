package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        int index = data.length;
        int i = 0;
        boolean tmp = data[i];
        for (; i < index; i++) {
            if (data[i] != tmp) {
                result = false;
                break;
            }

        }

        return result;

    }
}