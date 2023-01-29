package snippets;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        StringBuilder sb = new StringBuilder();
        sb.append(year).append("年")
            .append(month).append("月")
            .append(day).append("日")
            .append(hour).append("時")
            .append(minute).append("分")
            .append(second).append("秒");
        System.out.println(sb.toString());
    }
}
