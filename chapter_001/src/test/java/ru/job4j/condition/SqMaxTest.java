package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void sqmaxtestone() {
        SqMax maxsq = new SqMax();
        int result = maxsq.maxsq(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}