package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int indexpost = post.length;
        int indexword = word.length;
        for (int i = 0; i < indexpost; i++) {
            if (word[indexword - (i + 1)] != post[indexpost - (i + 1)]) {
                result = false;
            }
        }

        return result;
    }
}