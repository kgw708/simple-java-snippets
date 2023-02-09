package snippets.string;

public class SubstringExample {
    public static void main(String[] args) {
        String moji = "hogefugapiyo";
        System.out.println(String.format("文字列: %s", moji));
        System.out.println("先頭から4文字目までを抽出: " + moji.substring(0,4));
        System.out.println("5文字目から8文字目までを抽出: " + moji.substring(4,8));
        System.out.println("9文字目から12文字目までを抽出: " + moji.substring(8,12));
    }
}
