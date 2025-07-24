package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int space;
        for (int i = 0; i < (array.length - 1) / 2; i++) {
            space = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = space;

        }
        return array;
    }
}
