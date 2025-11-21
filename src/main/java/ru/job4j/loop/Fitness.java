package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int login) {
        int month = 0;
        while (ivan <= login) {
            month++;
            ivan *= 3;
            login *= 2;
        }
        return month;
    }
}
