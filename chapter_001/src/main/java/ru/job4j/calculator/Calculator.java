package ru.job4j.calculator;

/**
 * Package for calculate task.
 *
 * @author Aleksandr Tyotkin (Tyotkin@list.ru)
 */

public class Calculator {

    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + " = " + result);
    }

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + " = " + result);
    }

    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

    /**
     * Main.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        /**
         * Method add.
         * @param name first, second.
         * @return add first + double.
         */
        add(1, 1);
        /**
         * Method div.
         * @param name first, second.
         * @return div first / double.
         */
        div(4, 2);
        /**
         * Method multyply.
         * @param name first, second.
         * @return multyply first * double.
         */
        multiply(2, 1);
        /**
         * Method subtrack.
         * @param name first, second.
         * @return subtrack first - double.
         */
        subtrack(10, 5);

    }
}
