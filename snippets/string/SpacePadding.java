package snippets.string;

public class SpacePadding {
    public static void main(String[] args) {

        String s1 = String.format("%1$3d", 1);
        System.out.println("スペースパディング 3バイト数値の先頭スペース埋め: " + s1);

        String s2 = String.format("%1$5d", 1234);
        System.out.println("スペースパディング 5バイト数値の先頭スペース埋め: " + s2);

        String s3 = String.format("%1$8d", 99999);
        System.out.println("スペースパディング 8バイト数値の先頭スペース埋め: " + s3);
    }
}
