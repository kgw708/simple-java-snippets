package snippets.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {

        // 電話番号
        String phoneNumber = "0120-1234-5678";
        Pattern p1 = Pattern.compile("\\d{2,4}-\\d{2,4}-\\d{4}");
        Matcher m1 = p1.matcher(phoneNumber);
        System.out.println(m1.find());

        // 郵便番号
        String postalNumber = "100-0000";
        Pattern p2 = Pattern.compile("^\\d{3}-\\d{4}$");
        Matcher m2 = p2.matcher(postalNumber);
        System.out.println(m2.find());

        // etc
        String text = "abcd1234";
        System.out.println(text.matches("[a-z0-9]+"));
        System.out.println(text.matches("[a-z]+"));

        Pattern p3 = Pattern.compile(".s");
        Matcher m3 = p3.matcher("as");
        boolean b3 = m3.matches();
        System.out.println(b3);
    }
}
