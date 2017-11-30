package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayToArrayTest {
    @Test
    public void whenFirstArrayPlusSecondArrayThenThirdArray() {
        ArrayToArray array = new ArrayToArray();

        int[] first = {1, 3, 12};
        int[] second = {7, 9, 11};
        int[] expect = {1, 3, 7, 9, 11, 12};
        int[] result = array.arrayPlusArray(first, second);
        assertThat(result, is(expect));
    }
}
