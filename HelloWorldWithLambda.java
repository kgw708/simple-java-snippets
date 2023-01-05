public class HelloWorldWithLambda {
    public static void main(String[] args) {
        // part1
        Runnable runner = () -> { System.out.println("Hello World!"); };
        runner.run();

        // part2
        sub(() -> { System.out.println("Hello World?"); });
    }

    public static void sub(Runnable runner) {
        runner.run();
    }
}
