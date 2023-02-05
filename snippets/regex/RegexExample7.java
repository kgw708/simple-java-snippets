package snippets.regex;

public class RegexExample7 {
    public static void main(String[] args) {
        String[] regex = {".", "\n", "\t", "\\."};
        String[] strs = {".", "a", "ab", "abc", "\nabc", "\tabc"};

        for (int i = 0; i < regex.length; i++) {
            System.out.println("正規表現: \'" + regex[i] + "\'");
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].matches(regex[i])) {
                    System.out.println("文字列" + (j + 1) + ": \'" + strs[j] + "\' はマッチする");
                } else {
                    System.out.println("文字列" + (j + 1) + ": \'" + strs[j] + "\' はマッチしない");
                }
            }
        }
    }
}
