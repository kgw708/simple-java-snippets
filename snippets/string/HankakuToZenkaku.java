package snippets.string;

public class HankakuToZenkaku {
    public static void main(String[] args) {
        String target = "1234567890ｱｲｳｴｵabcdeｧｨｩｪｫABCDE!#$%&()";
        System.out.println("変換前：" + target);
        System.out.println("変換後：" + convert(target));
    }

    // 半角英字から全角英字への変換
    private static String convert(final String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                c = (char)(c - 'a' + 'ａ');
            }
            else if ('A' <= c && c <= 'Z') {
                c = (char)(c - 'A' + 'Ａ');
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
