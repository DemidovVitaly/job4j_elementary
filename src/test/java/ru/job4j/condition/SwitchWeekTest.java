package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SwitchWeekTest {

    @Test
    public void when1isMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Monday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when5isFriday() {
        int day =5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Friday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when8isError() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Error";
        assertThat(result).isEqualTo(expected);
    }
}