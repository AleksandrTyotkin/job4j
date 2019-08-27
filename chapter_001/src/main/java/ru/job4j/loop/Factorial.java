package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int a = 1; a <= n ; a++){
            if (n == 0)
            break;
                else{
            result = result * a;}
        }
        return result;
    }
}