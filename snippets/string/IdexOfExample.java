package snippets.string;

public class IdexOfExample {
    public static void main(String[] args) {

        String s1 = "hoge,fuga,piyo";
        int index1 = s1.indexOf(",");
        // System.out.println(index1);
        System.out.println(s1.substring(0, index1));

        String s2 = "2**3**4";
        int index2 = s2.lastIndexOf("**");
        // System.out.println(index2);
        System.out.println(s2.substring(0, index2));
    }
}
