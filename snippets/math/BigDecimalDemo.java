package snippets.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1");
        BigDecimal number2 = new BigDecimal("2");
        BigDecimal number3 = new BigDecimal("3.14");
        BigDecimal number4 = new BigDecimal("4.56");
        BigDecimal number5 = new BigDecimal("-5");

        // 足し算
        System.out.println(number1.add(number2));

        // 引き算
        System.out.println(number1.subtract(number2));

        // 掛け算
        System.out.println(number1.multiply(number2));

        // 割り算
        System.out.println(number1.divide(number2));

        // 絶対値
        System.out.println(number5);
        System.out.println(number5.abs());

        // 切り捨て
        System.out.println(number3.setScale(0, RoundingMode.FLOOR));

        // 切り上げ
        System.out.println(number3.setScale(0, RoundingMode.CEILING));

        // 四捨五入
        System.out.println(number3.setScale(0, RoundingMode.HALF_UP));
        System.out.println(number4.setScale(0, RoundingMode.HALF_UP));

        // 累乗
        System.out.println(number5.pow(2));

        // 比較（大きいほうを返却する）
        System.out.println(number1.max(number2));

        // 比較（小さいほうを返却する）
        System.out.println(number1.min(number2));

        // この値が比較対象の値より大きいとき、1を返却する
        // この値が比較対象の値より小さいとき、-1を返却する
        // この値が比較対象の値と同じとき、0を返却する
        System.out.println(number2.compareTo(number1));
        System.out.println(number1.compareTo(number2));
        System.out.println(number1.compareTo(number1));

        // 割り算の余りを返却する
        System.out.println(number3.remainder(number1));
    }
}
