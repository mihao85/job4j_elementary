package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int front) {
        return left >= right ? (left >= front ? left : front) : (right >= front ? right : front);
    }

    public static int max(int left, int right, int front, int before) {
        return left >= right ? (left >= front ? (left >= before ? left : before)
                : (front >= before ? front : before))
                : (right >= front ? (right >= before ? right : before)
                : (front >= before ? front : before));
    }
}
