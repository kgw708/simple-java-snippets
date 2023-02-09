package snippets.string;

public class StringJoinExample {
    public static void main(String[] args) {
        String[] array = {"aa", "bb", "cc", "dd"};
        String s = String.join(",", array);
        System.out.println(s);
    }
}
