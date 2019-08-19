package ru.job4j.condition;

public class MultiMax {
    public int multymax(int first, int second, int third) {
        int result =  first > second ? first : second;
        return third > result ? third : result;
    }
}