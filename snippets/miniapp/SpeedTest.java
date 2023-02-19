package snippets.miniapp;

public class SpeedTest {
    public static final long MOD = 1000000007;
    public static void main(String[] args) {
        long systemNanoTime = System.nanoTime();
        int n = 1000000;
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = (fib[i - 2] + fib[i - 1]) % MOD;
        }
        System.out.println((System.nanoTime() - systemNanoTime) / 1000000 + "ms");
        System.out.println(fib[n]);
    }
}
