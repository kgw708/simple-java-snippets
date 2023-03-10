package snippets.time;

import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateExample2 {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        LocalDate d2 = LocalDate.of(2023, 1, 31);
        System.out.println(d2);

        LocalDate d3 = LocalDate.of(2023, Month.APRIL, 1);
        System.out.println(d3);

        LocalDate d4 = LocalDate.of(2023, 2, 13);
        System.out.println(d4);
        System.out.println(d4.getYear());
        System.out.println(d4.getMonth());
        System.out.println(d4.getDayOfMonth());
        System.out.println(d4.getDayOfWeek());

        LocalDate d5 = LocalDate.of(2023, 3, 21);
        System.out.println(d5 + " -> 10日後 -> " + d5.plusDays(10));
        System.out.println(d5 + " -> 20日後 -> " + d5.plusDays(20));
        System.out.println(d5 + " -> 30日前 -> " + d5.minusDays(30));
        System.out.println(d5 + " -> 40日前 -> " + d5.minusDays(40));

        LocalDate d6 = LocalDate.of(2023, 1, 1);
        System.out.println(d6 + " -> 2日後 -> " + d6.plus(Period.ofDays(2)));
        System.out.println(d6 + " -> 2日前 -> " + d6.minus(Period.ofDays(2)));

        // 日付文字列からのパース
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate d7 = LocalDate.parse("2027/07/07", dtf);
        System.out.println(d7);

        // DateTimeExceptionエラー
        try {
            LocalDate.of(2023, Month.FEBRUARY, 29);
        } catch (DateTimeException e) {
            e.printStackTrace();
        }
    }
}
