package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecond(){
        Max maxim = new Max();
        int result = maxim.max(1,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondLessFirst(){
        Max maxim = new Max();
        int result = maxim.max(2,1);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstEquallySecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 1);
        assertThat(result, is(1));
    }
    @Test
    public void whenFirstAndSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstAndThirdLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 5, 1);
        assertThat(result, is(5));
    }
    @Test
    public void whenSecondAndThirdLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(8, 5, 6);
        assertThat(result, is(8));
    }
}
