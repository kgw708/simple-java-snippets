package snippets.string;

public class ZeroPadding {
    public static void main(String[] args) {

        String s1 = String.format("%1$03d", 1);
        System.out.println("ゼロパディング 3桁数字の先頭0埋め: " + s1);

        String s2 = String.format("%1$05d", 1234);
        System.out.println("ゼロパディング 5桁数字の先頭0埋め: " + s2);

        String s3 = String.format("%1$08d", 99999);
        System.out.println("ゼロパディング 8桁数字の先頭0埋め: " + s3);
    }
}
