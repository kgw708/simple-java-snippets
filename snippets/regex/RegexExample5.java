package snippets.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample5 {

    private static final String REGEX = "^\\d*";

    public static void main(String[] args) {
        // 先頭の数字だけ抽出する
        String s = "1粒\n300メートル\n";
        Pattern pattern = Pattern.compile(REGEX, Pattern.MULTILINE);
        Matcher match = pattern.matcher(s);
        while (match.find()) {
            System.out.println(match.group());
        }
    }
}
