package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHasNot10ThenMinus1() {
        /* Здесь нужно дописать тест, когда в массиве не найдено число 10.
        Можно искать любое другое число, корректно изменив при этом название теста */
        int[] data = new int[] {5, 1, 3};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas40Then4() {
        /* Здесь нужно дописать тест, когда в массиве не найдено число 10.
        Можно искать любое другое число, корректно изменив при этом название теста */
        int[] data = new int[]{5, 1, 3, 87, 40, 9};
        int el = 40;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {6, 9, 3, 78, 26};
        int el = 8;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
        /* Дописать тест, когда элемент 8 в диапазоне не найден.
        Можно искать любой другой элемент, корректно отражая этот факт в названии теста. */
    }
}