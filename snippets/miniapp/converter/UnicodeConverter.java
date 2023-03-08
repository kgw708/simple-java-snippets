package snippets.miniapp.converter;

public class UnicodeConverter {
    public static void main(String[] args) {

        char c1 = 'あ';
        
        // 文字に対応するUnicodeコードを取得
        int code = (int) c1;
        System.out.println(code);

        // 文字コードを16進数で取得
        String hexCode = Integer.toHexString(code);
        System.out.println(hexCode);

        char c2 = '\u4e9c';

        // 文字コードに対応する文字を取得
        System.out.println(c2);
    }
}
