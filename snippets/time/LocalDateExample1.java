package snippets.time;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class LocalDateExample1 {
    public static void main(String[] args) {

        // 日付の整形
        System.out.println("LocalDate: " + LocalDate.now());
        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = ld.format(dtf1);
        System.out.println(formattedDate);
    }
}
