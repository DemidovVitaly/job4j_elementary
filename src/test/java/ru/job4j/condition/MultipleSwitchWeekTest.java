package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayIs1() {
        String day = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWednesdayIs3() {
        String day = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenError() {
        String day = "nothing";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}