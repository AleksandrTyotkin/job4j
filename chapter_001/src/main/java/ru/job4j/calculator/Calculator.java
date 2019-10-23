package ru.job4j.calculator;

/**
 * Package for calculate task.
 *
 * @author Aleksandr Tyotkin (Tyotkin@list.ru)
 */

public class Calculator {
    /**
     * Method add.
     *
     * @param name first, second.
     * @return add first + double.
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    /**
     * Method div.
     *
     * @param name first, second.
     * @return div first / double.
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + " = " + result);
    }

    /**
     * Method multyply.
     *
     * @param name first, second.
     * @return multyply first * double.
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + " = " + result);
    }

    /**
     * Method subtrack.
     *
     * @param name first, second.
     * @return subtrack first - double.
     */
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

        add(1, 1);

        div(4, 2);

        multiply(2, 1);

        subtrack(10, 5);

    }
}
