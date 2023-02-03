package snippets;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {
    public static void main(String[] args) {
        System.out.println("LocalDate: " + LocalDate.now());
        System.out.println("LocalTime: " + LocalTime.now());
        System.out.println("LocalDateTime: " + LocalDateTime.now());

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = ldt.format(dtf);
        System.out.println(formattedDate);
    }
}
