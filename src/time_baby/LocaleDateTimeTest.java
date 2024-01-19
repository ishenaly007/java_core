package time_baby;

import java.time.*;

public class LocaleDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today: " + today);

        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Today: " + today);

        today = LocalDateTime.of(2020, 12, 7, 15, 43, 59, 35);
        System.out.println("Today: " + today);

        LocalDateTime baseTime2000 = LocalDateTime.ofEpochSecond(2000, 500, ZoneOffset.UTC);
        System.out.println("The time of 2000sec after 1970.01.01 : " + baseTime2000);

        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        System.out.println(zone1);
        System.out.println(zone2);

        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("Local time with Kolkata: " + time1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Local time with Tokyo: " + time2);
    }
}
