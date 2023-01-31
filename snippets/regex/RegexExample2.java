package snippets.regex;

import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        String text1 = "admin@example.com";
        String text2 = "test*example.com";
        String text3 = "https://example.com/";
        String[] array = {text1, text2, text3};
    
        // メールアドレスの正規表現
        String regex = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
        Pattern p = Pattern.compile(regex);

        for (String s : array) {
            if (p.matcher(s).find()) {
                System.out.println("'" + s + "'" + " is a mail address.");
            } else {
                System.out.println("'" + s + "'" + " is not a mail address.");
            }
        }
    }
}
