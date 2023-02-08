package snippets.string;

public class StringConcatDemo {
    public static void main(String[] args) {
        String hoge = "hoge";
        String fuga = "fuga";
        String piyo = "piyo";
        System.out.println("+演算子による文字列連結: " + hoge + fuga + piyo);
        System.out.println("concatによる文字列連結: " + hoge.concat(fuga).concat(piyo));

        StringBuilder sb = new StringBuilder();
        sb.append(hoge).append(fuga).append(piyo);
        System.out.println("StringBuilderによる文字列連結: " + sb.toString());
    }
}
