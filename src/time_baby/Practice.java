package time_baby;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2007, Month.FEBRUARY, 3, 12, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, Month.AUGUST, 30, 12, 30);
        System.out.println(dateTime1.format(DateTimeFormatter.ofPattern("dd.MMM.uuuu").localizedBy(Locale.ENGLISH)));
        System.out.println(dateTime2.format(DateTimeFormatter.ofPattern("dd.MMM.uuuu").localizedBy(Locale.ENGLISH)));

        System.out.println((dateTime2.minusYears(dateTime1.getYear()).getYear()));

        System.out.println(Duration.between(dateTime1, dateTime2).toDays());
    }
}
