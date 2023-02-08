package snippets.collection;

import java.util.HashMap;
import java.util.Map;

public class MapLoopDemo {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("hoge", Long.valueOf(123));
        map.put("fuga", Long.valueOf(456));
        map.put("piyo", Long.valueOf(789));

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
