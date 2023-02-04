package snippets.regex;

public class RegexExample6 {
    public static void main(String[] args) {
        String[] strs = {"biz", "com", "net", "xyz", "dev"};
        String regex = ".*[abc]+.*";

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].matches(regex)) {
                System.out.println("文字列" + (i + 1) + ": \'" + strs[i] + "\' はマッチする");
            } else {
                System.out.println("文字列" + (i + 1) + ": \'" + strs[i] + "\' はマッチしない");
            }
        }
    }
}
