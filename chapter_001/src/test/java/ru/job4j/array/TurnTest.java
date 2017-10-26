package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
   @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray(){
    Turn turn = new Turn();
    int [] input = {1,2,3,4};
       int [] expect = {4,3,2,1};
       int[] result = turn.back(input);
       assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int [] input = {1,2,3,4,5};
        int [] expect = {5,4,3,2,1};
        int[] result = turn.back(input);
        assertThat(result, is(expect));
    }
}