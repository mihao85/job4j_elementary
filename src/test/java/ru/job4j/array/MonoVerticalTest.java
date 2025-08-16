package ru.job4j.array;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MonoVerticalTest {

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MonoVertical.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoNotVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MonoVertical.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoNotX() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int column = 2;
        boolean result = MonoVertical.monoVertical(input, column);
        assertThat(result).isFalse();
    }
}