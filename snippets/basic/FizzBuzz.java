package snippets.basic;

/**
 * FizzBuzz問題
 * 
 * 1〜100の数字をカウントしていき、
 * 3の倍数のときはFizz、
 * 5の倍数のときはBuzz、
 * 3と5に共通する倍数のときはFizzBuzz、
 * それ以外のときは数字を表示する。
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int count = 1; count <= 100; count++) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (count % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (count % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(count);
            }
        }
    }
}
