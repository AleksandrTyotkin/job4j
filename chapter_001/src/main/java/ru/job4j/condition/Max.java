package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        return  left > right ? left : right;
        /*int result = (left > right) ? (result = left) : (result = right);
        int firstsecond1 = (left > right) ? (firstsecond1 = left) : (firstsecond1 = right);
        int equal = (left != right) ? (equal = 0) : (equal = 1);

        return result;*/

    }
}