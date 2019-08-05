package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(140);
        int rubleE = euroToRuble(140);
        int rubleD = dollarToRuble(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("140 euro are " + rubleE + " ruble.");
        System.out.println("140 dollar are " + rubleD + " ruble.");
        int in = 140;
        int expected = 2;
        int out_RE = rubleToEuro(in);
        boolean passed_RE = expected == out_RE;
            System.out.println("140 rubles are 2. Test result №1 : " + passed_RE);

        int out_RD = rubleToDollar(in);
        boolean passed_RD = expected == out_RD;
            System.out.println("140 rubles are 2. Test result №2: " + passed_RD);

        int expected1 = 9800;
        int out_ER = euroToRuble(in);
        boolean passed_ER = expected1 == out_ER;
            System.out.println("140 euro are 9800. Test result №3: " + passed_ER);

        int expected2 = 8400;
        int out_DR = dollarToRuble(in);
        boolean passed_DR = expected2 == out_DR;
            System.out.println("140 dollars are 8400. Test result №4: " + passed_DR);


    }
}

