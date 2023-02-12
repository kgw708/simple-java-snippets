package snippets.date;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateExample2 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        // year
        DateFormat format = new SimpleDateFormat("yyyy");
        System.out.println(format.format(date));

        // month
        format = new SimpleDateFormat("MM");
        System.out.println(format.format(date));

        // day
        format = new SimpleDateFormat("dd");
        System.out.println(format.format(date));

        // hour
        format = new SimpleDateFormat("HH");
        System.out.println(format.format(date));

        // minute
        format = new SimpleDateFormat("mm");
        System.out.println(format.format(date));

        // second
        format = new SimpleDateFormat("ss");
        System.out.println(format.format(date));

        // yyyy/MM/dd
        format = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(format.format(date));

        // yyyy-MM-dd HH:mm:ss
        format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
    }
}
