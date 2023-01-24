package snippets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConstantDemo {

    private static final String HOGE = "hoge";

    private static final Map<String, Integer> FRUITS_MAP;
    static {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("いちご", Integer.valueOf(500));
        map.put("ぶどう", Integer.valueOf(350));
        map.put("なし", Integer.valueOf(200));
        map.put("みかん", Integer.valueOf(150));
        map.put("もも", Integer.valueOf(400));
        map.put("りんご", Integer.valueOf(100));
        FRUITS_MAP = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        System.out.println(HOGE);
        System.out.println(FRUITS_MAP);
    }
}
