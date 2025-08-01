package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TriangleTest {
    @Test
    void whenExistTriangl() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenExistIsNoTriangl() {
        double ab = 1.0;
        double ac = 1.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

}