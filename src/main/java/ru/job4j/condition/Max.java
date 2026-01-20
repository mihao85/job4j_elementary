package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int front) {
        return max(left, max(right, front));
    }

    public static int max(int left, int right, int front, int before) {
        return max(left, max(right, max(before, front)));
    }
}
