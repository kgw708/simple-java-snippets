package snippets.calendar;

import java.util.Calendar;

public class CalendarExample3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, 1, 11);

        System.out.println(
            cal.get(Calendar.YEAR) + "/" + 
            (cal.get(Calendar.MONTH) + 1) + "/" +
            cal.get(Calendar.DATE));
    }
}
