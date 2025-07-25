package ru.job4j.array;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TurnTest {

    @Test
    void whenTurnArrayWidthEvenAmountOfElementsThenArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWidthNotEvenAmountOfElementsThenArray() {
        int[] input = new int[]{5, 7, 6, 1, 8};
        int[] result = Turn.back(input);
        int[] expected = new int[]{8, 1, 6, 7, 5};
        assertThat(result).containsExactly(expected);
    }
}