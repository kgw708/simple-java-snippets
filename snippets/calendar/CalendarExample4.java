package snippets.calendar;

import java.util.Calendar;

public class CalendarExample4 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        // 今日
        displayConsole(cal);

        // 1日前
        cal.add(Calendar.DATE, -1);
        displayConsole(cal);

        // 1ヶ月後
        cal.add(Calendar.MONTH, 1);
        displayConsole(cal);
    }

    private static void displayConsole(Calendar cal) {
        System.out.println(
            cal.get(Calendar.YEAR) + "/" + 
            (cal.get(Calendar.MONTH) + 1) + "/" + 
            cal.get(Calendar.DATE));
    }
}
