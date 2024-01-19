package time_baby;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParsingTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        //standart time
        System.out.println(date);

        //our format time
        System.out.println(date.format(DateTimeFormatter.ofPattern("d MMMM uuuu").localizedBy(Locale.ENGLISH)));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println();

        LocalDateTime dateTime = LocalDateTime.now();
        //standart time
        System.out.println(dateTime);


        //our format time
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d MMMM uuuu | HH:mm:ss").localizedBy(Locale.ENGLISH)));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
