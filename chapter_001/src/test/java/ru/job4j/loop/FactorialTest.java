package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial Five = new Factorial();
                int result = Five.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial Zero = new Factorial();
        int result = Zero.calc(0);
        assertThat(result, is(1));
    }
}