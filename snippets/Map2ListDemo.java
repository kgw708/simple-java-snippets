package snippets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2ListDemo {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("hoge", Long.valueOf(123));
        map.put("fuga", Long.valueOf(456));
        map.put("piyo", Long.valueOf(789));

        List<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList.toString());

        List<Long> valueList = new ArrayList<>(map.values());
        System.out.println(valueList.toString());
    }
}
