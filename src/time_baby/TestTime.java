package time_baby;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TestTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specificDay = LocalDate.of(2007, Month.FEBRUARY, 3);
        System.out.println(specificDay);

        LocalDate epochDate = LocalDate.ofEpochDay(0);
        System.out.println(epochDate);

        LocalDate day2002011 = LocalDate.ofYearDay(2011, 200);
        System.out.println(day2002011);

        //Получаем текущее время
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Получаем определенное время
        LocalTime specificTime = LocalTime.of(12, 45, 34, 212);
        System.out.println(specificTime);

        //Получаем время через 2000 секунд после 1970.01.01
        LocalTime sec2000 = LocalTime.ofSecondOfDay(2000);
        System.out.println(sec2000);
    }
}
