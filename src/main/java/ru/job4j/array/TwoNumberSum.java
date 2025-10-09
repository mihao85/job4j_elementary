package ru.job4j.array;


public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        while (i <= j) {
            if (array[i]+array[j] == target) {
              return new int[]{i, j};
            }
            if (array[i]+array[j] != target) {
                i++;
            }
            j++;

        }
        return new int[0];
    }
}
