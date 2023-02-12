package snippets.calendar;

import java.util.Calendar;

public class CalendarExample5 {
    public static void main(String[] args) {

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        // calendar2を1日後にする
        cal2.add(Calendar.DATE, 1);

        // calendar1はcalendar2より前 = true
        System.out.println(cal1.before(cal2));

        // calendar1はcalendar2より後 = false
        System.out.println(cal1.after(cal2));
    }
}
