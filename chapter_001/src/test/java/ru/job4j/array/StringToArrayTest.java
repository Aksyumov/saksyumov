package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringToArrayTest {
    @Test
        public void whenStringInStringThenTrue(){
            StringToArray string = new StringToArray();
            boolean expect = true;
            boolean result = string.contains("Привет","иве");
            assertThat(result, is(expect));
    }
    @Test
    public void whenStringNotInStringThenFalse(){
        StringToArray string = new StringToArray();
        boolean expect = false;
        boolean result = string.contains("Привет","Пока");
        assertThat(result, is(expect));
    }
}
