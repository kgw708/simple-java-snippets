package snippets.date;

import java.util.Calendar;
import java.util.Date;

public class DateExample1 {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1);

        Calendar cal = Calendar.getInstance();
        Date date2 = cal.getTime();
        System.out.println(date2);
    }
}
