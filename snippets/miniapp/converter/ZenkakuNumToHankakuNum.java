package snippets.miniapp.converter;

public class ZenkakuNumToHankakuNum {

    public static void main(String[] args) {
        System.out.println(converter("１９８０円です。"));
    }

    public static String converter(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '０' && c <= '９') {
                sb.setCharAt(i, (char) (c - '０' + '0'));
            }
        }
        return sb.toString();
    }
}
