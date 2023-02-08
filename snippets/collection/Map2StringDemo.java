package snippets.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Map2StringDemo {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("hoge", Long.valueOf(123));
        map.put("fuga", Long.valueOf(456));
        map.put("piyo", Long.valueOf(789));

        String str = map.entrySet().stream()
            .map(e -> e.getKey() + ":" + e.getValue())
            .collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
