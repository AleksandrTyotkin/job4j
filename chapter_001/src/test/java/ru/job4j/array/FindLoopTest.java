package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {


    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLengh5Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind10() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 10;
        int start = 3;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void sortone() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 2, 10, 0, 4};
        int[] result = find.sort(input);
        int[] expect = new int[]{0, 2, 4, 5, 10};
        assertThat(result, is(expect));
    }

    @Test
    public void sorttwo() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 2, 10, 0, 4, 13, 3};
        int[] result = find.sort(input);
        int[] expect = new int[]{0, 2, 3, 4, 5, 10, 13};
        assertThat(result, is(expect));
    }


}