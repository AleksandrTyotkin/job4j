package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() { //Тест максимального значения
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void first() {  //Тест максимального первого
        Max max = new Max();
        int firstsecond = max.max(2, 1);
        assertThat(firstsecond, is(2));
    }

    @Test
    public void second() {   //Тест максимального второго
        Max max = new Max();
        int firstsecond = max.max(1, 2);
        assertThat(firstsecond, is(2));
    }

    @Test
    public void equal() {    //Тест равенства
        Max max = new Max();
        int equal = max.max(1, 1);
        assertThat(equal, is(1));
    }



}