package ru.job4j.inheritance;

public class Programmer {
    private String programLanguage;

    public Programmer(String programLanguage, int experience, boolean degree) {
        super(experience, degree);
        this.programLanguage = programLanguage;
    }
}
