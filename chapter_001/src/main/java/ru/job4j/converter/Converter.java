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
        int outRe = rubleToEuro(in);
        boolean passedRe = expected == outRe;
            System.out.println("140 rubles are 2. Test result №1 : " + passedRe);

        int outRd = rubleToDollar(in);
        boolean passedRd = expected == outRd;
            System.out.println("140 rubles are 2. Test result №2: " + passedRd);

        int expected1 = 9800;
        int outEr = euroToRuble(in);
        boolean passedEr = expected1 == outEr;
            System.out.println("140 euro are 9800. Test result №3: " + passedEr);

        int expected2 = 8400;
        int outDr = dollarToRuble(in);
        boolean passedDr = expected2 == outDr;
            System.out.println("140 dollars are 8400. Test result №4: " + passedDr);


    }
}

