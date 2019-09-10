package ru.job4j.loop;

public class Mortgage {
    public int year( int amount, int salary, double percent) {
        int year = 0;
        double lost = 0;
        double lostyear = 0;
        lostyear = amount + amount*(percent/100);
        while (lost>=0){
             lost = lostyear - salary;
             lostyear = lost + lost*(percent/100);
          year++;
        }

        return year;
    }
}