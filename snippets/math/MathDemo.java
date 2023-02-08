package snippets.math;

public class MathDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("compare two values...");
        System.out.println("return the larger number: " + Math.max(a, b));
        System.out.println("return the smaller number: " + Math.min(a, b));

        double x = 3.14;
        // 切り捨て
        System.out.println("truncate decimal places: " + Math.floor(x));

        double y = 3.4;
        double z = 3.5;
        // 四捨五入
        System.out.println("round off decimal places: " + Math.round(y));
        System.out.println("round off decimal places: " + Math.round(z));

        double xx = 4.1;
        // 切り上げ
        System.out.println("round up decimal places: " + Math.ceil(xx));

        int yy = -8;
        // 絶対値をとる
        System.out.println("take the absolute value: " + Math.abs(yy));

        double aa = 10;
        double bb = 3;
        // 累乗
        System.out.println("exponentiation calculations: " + Math.pow(aa, bb));

        // 乱数
        System.out.println("random: " + Math.random());
    }
}
