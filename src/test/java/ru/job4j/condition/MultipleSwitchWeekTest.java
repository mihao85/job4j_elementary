package ru.job4j.condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {
    @Test
    void mondayNumberOfDay() {
        String nameRus = "Понедельник";
        String nameUSA = "Monday";
        int numberRus = MultipleSwitchWeek.numberOfDay(nameRus);
        int numberUSA = MultipleSwitchWeek.numberOfDay(nameUSA);
        int expectedRUS = 1;
        int expectedUSA = 1;
        assertThat(numberRus).isEqualTo(expectedRUS);
        assertThat(numberUSA).isEqualTo(expectedUSA);
    }

    @Test
    void wednesdayNumberOfDay() {
        String nameRus = "Среда";
        String nameUSA = "Wednesday";
        int numberRus = MultipleSwitchWeek.numberOfDay(nameRus);
        int numberUSA = MultipleSwitchWeek.numberOfDay(nameUSA);
        int expectedRUS = 3;
        int expectedUSA = 3;
        assertThat(numberRus).isEqualTo(expectedRUS);
        assertThat(numberUSA).isEqualTo(expectedUSA);
    }

    @Test
    void saturdayNumberOfDay() {
        String nameRus = "Суббота";
        String nameUSA = "Saturday";
        int numberRus = MultipleSwitchWeek.numberOfDay(nameRus);
        int numberUSA = MultipleSwitchWeek.numberOfDay(nameUSA);
        int expectedRUS = 6;
        int expectedUSA = 6;
        assertThat(numberRus).isEqualTo(expectedRUS);
        assertThat(numberUSA).isEqualTo(expectedUSA);
    }

    @Test
    void notDayNumberOfDay() {
        String nameRus = "Самый лучшый день!!!";
        String nameUSA = "The best day ever!!!";
        int numberRus = MultipleSwitchWeek.numberOfDay(nameRus);
        int numberUSA = MultipleSwitchWeek.numberOfDay(nameUSA);
        int expectedRUS = -1;
        int expectedUSA = -1;
        assertThat(numberRus).isEqualTo(expectedRUS);
        assertThat(numberUSA).isEqualTo(expectedUSA);
    }
}