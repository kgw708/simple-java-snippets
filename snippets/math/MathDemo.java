package snippets.math;

public class MathDemo {
    public static void main(String[] args) {

        // 数値の比較 大なり/小なり
        int a = 100;
        int b = 200;
        System.out.println("compare two values...");
        System.out.println("return the larger number: " + Math.max(a, b));
        System.out.println("return the smaller number: " + Math.min(a, b));

        // 切り捨て
        double x = 3.14;
        System.out.println("truncate decimal places: " + Math.floor(x));

        // 四捨五入
        double y = 3.4;
        double z = 3.5;
        System.out.println("round off decimal places: " + Math.round(y));
        System.out.println("round off decimal places: " + Math.round(z));

        // 切り上げ
        double xx = 4.1;
        System.out.println("round up decimal places: " + Math.ceil(xx));

        // 絶対値
        int yy = -8;
        System.out.println("take the absolute value: " + Math.abs(yy));

        // 累乗
        double aa = 10;
        double bb = 3;
        System.out.println("exponentiation calculations: " + Math.pow(aa, bb));

        // 乱数
        System.out.println("random: " + Math.random());
    }
}
