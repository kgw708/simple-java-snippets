package snippets.string;

public class ZenkakuToHankaku {
    public static void main(String[] args) {
        String target = "1234567890ｱｲｳｴｵＡＢＣＤＥｧｨｩｪｫａｂｃｄｅ!#$%&()";
        System.out.println("変換前：" + target);
        System.out.println("変換後：" + convert(target));
    }

    // 全角英字から半角英字への変換
    private static String convert(final String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( 'ａ' <= c && c <= 'ｚ') {
              c = (char)(c - 'ａ' + 'a');
            }
            else if ( 'Ａ' <= c && c <= 'Ｚ') {
              c = (char)(c - 'Ａ' + 'A');
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
