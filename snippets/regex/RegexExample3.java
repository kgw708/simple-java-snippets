package snippets.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {

    private static final String REGEX = "(\\d{2,4})-(\\d{2,4})-(\\d{4})";

    public static void main(String[] args) {
        // 電話番号だけ抽出する
        Pattern pattern = Pattern.compile(REGEX);
        Matcher match = pattern.matcher("0123-45-6789, 070-1234-5678, 03-0000-0000");
        while (match.find()) {
            System.out.println("start：" + match.start());
            System.out.println("end：" + match.end());
            System.out.println("matching string：" + match.group());
            System.out.println("市外局番：" + match.group(1));
            System.out.println("市内局番：" + match.group(2));
            System.out.println("加入者番号：" + match.group(3));
        }
    }
}
