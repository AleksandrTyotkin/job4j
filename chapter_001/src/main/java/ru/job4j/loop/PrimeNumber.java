package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
                int count = 1;//количесвто простых чисел
                for (int num = 3; num <= finish; num++) {
                    int dig = 0;//количество делителей
                    for (int div = 2; div < num ; div++) {
                        if ((div * div) <= num && dig != 1) {
                            if (num % div == 0) {
                                dig++;
                            }

                        }
                    }
                    if (dig!=1){
                        count++;
                    }

                }
                return count;
    }
}