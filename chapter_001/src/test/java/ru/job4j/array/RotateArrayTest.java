package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RotateArrayTest {
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotate = new RotateArray();
        int[][] input = {{1, 2}, {3, 4}};
        int[][] expect = {{3, 1}, {4, 2}};
        int[][] result = rotate.rotate(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotate = new RotateArray();
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expect = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] result = rotate.rotate(input);
        assertThat(result, is(expect));
    }
}