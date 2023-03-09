package snippets.time;

import java.time.LocalDateTime;

public class LocalDateTimeExapmle3 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2023, 3, 9, 21, 30, 0);
        System.out.println(ldt);
    
        // 3年前
        ldt = ldt.minusYears(3);
        // 3ヶ月前
        ldt = ldt.minusMonths(3);
        // 3日前
        ldt = ldt.minusDays(3);
        // 3時間前
        ldt = ldt.minusHours(3);
        // 3分前
        ldt = ldt.minusMinutes(3);
        // 3秒前
        ldt = ldt.minusSeconds(3);
        System.out.println(ldt);
    }
}
