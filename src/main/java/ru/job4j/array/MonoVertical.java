package ru.job4j.array;


public class MonoVertical {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < column; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
