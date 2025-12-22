package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distanceTwo() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        assertEquals(0.0, a.distance(b), 0.001);
    }

    @Test
    void distanceTwoSix() {
        Point a = new Point(2, 6);
        Point b = new Point(0, 2);
        assertEquals(4.472, a.distance(b), 0.001);
    }

    @Test
    void distanceTwoSixTen() {
        Point a = new Point(2, 6);
        Point b = new Point(10, 2);
        assertEquals(8.944, a.distance(b), 0.001);
    }
}