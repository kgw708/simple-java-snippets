package snippets.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("OffsetDateTime.now() = " + OffsetDateTime.now());
        System.out.println("ZonedDateTime.now() = " + ZonedDateTime.now());
    }
}
