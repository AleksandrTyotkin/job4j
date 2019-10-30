package ru.job4j.array;

/**
 * Задание 6.8. Удаление дубликатов в массиве.[#162678].
 *
 * @author Aleksandr Tyotkin (Tyotkin@list.ru)
 */

public class Defragment {
    /**
     * Method String[].Перемещает заполненные ячейки массива в начало, а пустые в конец
     *
     * @param name array.
     * @return array.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                String tmp = array[index];
                int indextmp = index;
                while (indextmp < array.length) {
                    String celltmp = array[indextmp];
                    if (celltmp != null) {
                        String tmp1 = array[indextmp];
                        array[index] = tmp1;
                        array[indextmp] = tmp;
                        break;
                    }
                    indextmp++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Method main.
     *
     * @param name args.
     * @return void.
     */

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}