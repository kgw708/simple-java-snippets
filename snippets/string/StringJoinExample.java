package snippets.string;

import java.util.Arrays;
import java.util.List;

public class StringJoinExample {
    public static void main(String[] args) {

        String[] array = {"aa", "bb", "cc", "dd"};
        String s1 = String.join(", ", array);
        System.out.println(s1);

        List<String> list = Arrays.asList("A", "B", "C", "D");
        String s2 = String.join(", ", list);
        System.out.println(s2);
    }
}
