package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 6, 3, 4, 5, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0to4() {
        int[] input = {1, 2, 3, 4, 999};
        int source = 0;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {999, 2, 3, 4, 1};
        assertThat(result).containsExactly(expected);
    }
}