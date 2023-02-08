package snippets.string;

import java.util.Arrays;

public class CharStringExample {
    public static void main(String[] args) {
        char[] ch = {'a', 'i', 'u', 'e', 'o'};
        String s1 = String.valueOf(ch);
        System.out.println(s1);

        String s2 = "This is great.";
        char[] chars = s2.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
