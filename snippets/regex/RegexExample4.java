package snippets.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample4 {

    private static final String REGEX = "[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(\\.[a-z0-9-]+)*";

    public static void main(String[] args) {
        // メールアドレスだけ抽出する
        String s = "管理者用のメールはmail@example.comです。個人宛のメールはprivate@example.netです。";
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(s);
        while (match.find()) {
            System.out.println(match.group());
        }
    }
}
