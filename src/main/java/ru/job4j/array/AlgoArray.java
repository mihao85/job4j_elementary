package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i]; /* переменная для временного хранения значение ячейки с индексом 0. */
                    array[i] = array[j]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
                    array[j] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
                }
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
