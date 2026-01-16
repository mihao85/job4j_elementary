package ru.job4j.condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3Then3() {
        int left = 4;
        int right = 7;
        int front = 2;
        int result = Max.max(left, right, front);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To4Then4() {
        int left = 4;
        int right = 7;
        int front = 2;
        int before = 10;
        int result = Max.max(left, right, front, before);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}