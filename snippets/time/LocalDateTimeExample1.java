package snippets.time;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class LocalDateTimeExample1 {
    public static void main(String[] args) {

        // 日時の整形
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = ldt.format(dtf2);
        System.out.println(formattedDateTime);
    }
}
