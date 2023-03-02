package snippets.miniapp.calendar;

import java.util.Calendar;

public class GenerateCalendar {

    private int[][] calendarMatrix = new int[6][7];
    private int startDate;
    private int lastDate;
    private static final String LINE_FEED = "\n";

    // constructor
    public GenerateCalendar(int targetYear, int targetMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        // Get the first day of the week in the month.
        calendar.set(targetYear, targetMonth - 1, 1);
        startDate = calendar.get(Calendar.DAY_OF_WEEK);

        // Get the last day of the month.
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        lastDate = calendar.get(Calendar.DATE);

        // Create a calendar in tabular format.
        int row = 0;
        int column = startDate - 1;
        for (int date = 1; date <= lastDate; date++) {
            calendarMatrix[row][column] = date;
            if (column == 6) {
                row++;
                column = 0;
            } else {
                column++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        loop: for (int i = 0; i < calendarMatrix.length; i++) {
            for (int j = 0; j < calendarMatrix[i].length; j++) {
                int day = calendarMatrix[i][j];
                if (day == 0) {
                    if (i != 0) {
                        break loop;
                    }
                    sb.append("   ");
                } else if (day < 10) {
                    sb.append("  ").append(day);
                } else {
                    sb.append(" ").append(day);
                }
            }
            sb.append(LINE_FEED);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int month = 1; month <= 12; month++) {
            System.out.println(LINE_FEED + currentYear + "年" + month + "月");
            System.out.println(" 日 月 火 水 木 金 土");
            System.out.println(new GenerateCalendar(currentYear, month));
        }
    }
}
