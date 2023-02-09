package snippets.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List2AnotherListExample {
    public static void main(String[] args) {
        List<String> strList =
            List.of("hoge", "fuga", "piyo", "foo", "bar", "baz");

        List<String> resultList = new ArrayList<>();
        for (String str : strList) {
            if (str.length() >= 3 && str.contains("a")) {
                resultList.add(str);
            }
        }
        System.out.println(resultList);

        // Stream API
        List<String> extractList = strList.stream()
                                        .filter(s -> s.length() >= 3)
                                        .filter(s -> s.contains("a"))
                                        .collect(Collectors.toList());
        System.out.println(extractList);
    }
}
