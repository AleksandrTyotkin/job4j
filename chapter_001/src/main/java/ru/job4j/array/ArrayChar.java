package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int index = pref.length;
        int i = 0;
        for (; i < index; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }


        }
        return result;
    }
}