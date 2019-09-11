package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int dig = 1;
        for (int i = 0; i < bound; i++) {
            rst[i] = dig * dig;
            dig++;
        }
        return rst;
    }
}