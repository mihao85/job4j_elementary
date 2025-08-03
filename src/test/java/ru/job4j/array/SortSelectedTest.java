package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThenFive() {
        int[] data = new int[]{10, 4, 4, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 4, 7, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThenThree() {
        int[] data = new int[]{9, 12, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{8, 9, 12};
        assertThat(result).containsExactly(expected);
    }
}