package snippets.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstantDemo {

    private static final String HOGE = "hoge";

    private static final List<String> BOOKS_LIST;
    static {
        List<String> list = new ArrayList<>();
        list.add("magazine");
        list.add("comic");
        list.add("novel");
        list.add("dictionary");
        BOOKS_LIST = Collections.unmodifiableList(list);
    }

    private static final Map<String, Integer> FRUITS_MAP;
    static {
        Map<String, Integer> map = new HashMap<String, Integer>();
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
        System.out.println(BOOKS_LIST);
        System.out.println(FRUITS_MAP);

        // 以下はエラーになる
        // BOOKS_LIST.add("pictorial book");
        // FRUITS_MAP.put("すいか", Integer.valueOf(1000));
    }
}
