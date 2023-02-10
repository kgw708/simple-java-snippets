package snippets.time;

import java.time.LocalDateTime;

public class LocalDateTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);

        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getHour());
        System.out.println(d.getMinute());
        System.out.println(d.getSecond());
        System.out.println(d.getNano());

        // yyyy-MM-ddThh:mm:ss
        LocalDateTime ldt1 =
            LocalDateTime.of(2023, 1, 23, 23, 59, 59);
        System.out.println(ldt1);

        // yyyy-MM-ddThh:mm:ss.sssssssss
        LocalDateTime ldt2 =
            LocalDateTime.of(2023, 1, 23, 23, 59, 59, 999999999);
        System.out.println(ldt2);
    }
}
