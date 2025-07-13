package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Vasya";
        names[1] = "Katya";
        names[2] = "Dasha";
        names[3] = "Masha";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
