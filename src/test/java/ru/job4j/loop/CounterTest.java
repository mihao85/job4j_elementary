package ru.job4j.loop;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    void sumNorm() {
        int start = 2;
        int finish = 4;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void sumMinus() {
        int start = -1;
        int finish = 3;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void sumZero() {
        int start = 9;
        int finish = 3;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFourToTenThenSeventy() {
        int start = 4;
        int finish = 17;
        int result = Counter.sumByEven(start, finish);
        int expected = 70;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFourToTenThenZero() {
        int start = -4;
        int finish = 17;
        int result = Counter.sumByEven(start, finish);
        int expected = 66;
        assertThat(result).isEqualTo(expected);
    }
}