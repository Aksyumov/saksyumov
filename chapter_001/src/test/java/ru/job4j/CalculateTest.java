package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Test
 * @author aksyumov
 * @since 28.09.2017
 * @version 1.0
 */
public class CalculateTest {
/**
 * Test  echo.
 */
 @ Test
 public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Aksyumov";
    String expect = "Echo, echo, echo : Aksyumov";
    Calculate calc = new ru.job4j.Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
}