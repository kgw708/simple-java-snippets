package snippets.miniapp.converter;

public class HankakuNumToZenkakuNum {

    public static void main(String[] args) {
        System.out.println(converter("198円です。"));
    }

    public static String converter(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.setCharAt(i, (char) (c - '0' + '０'));
            }
        }
        return sb.toString();
    }
}
