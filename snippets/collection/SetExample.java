package snippets.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("A1");
        set1.add("B1");
        set1.add("B1");
        set1.add("Z1");
        set1.add("C1");

        for (String s : set1) {
            System.out.println(s);
        }

        Set<String> set2 = new TreeSet<>();
        set2.add("A2");
        set2.add("B2");
        set2.add("B2");
        set2.add("Z2");
        set2.add("C2");

        for (String s : set2) {
            System.out.println(s);
        }
    }
}
