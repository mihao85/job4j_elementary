package ru.job4j.condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void tuesdayNameOfDay() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void thursdayNameOfDay() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sundayNameOfDay() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void notDayNameOfDay() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Нет такого дня!";
        assertThat(result).isEqualTo(expected);
    }
}