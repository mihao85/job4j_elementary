package ru.job4j.array;
public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }
    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        if (data.length != 0 && start > 0 && finish > 0 && start < data.length - 1 && finish <= data.length - 1 && start <= finish) {
            for (int i = start; i <= finish; i++) {
                if (data[i] == element) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
