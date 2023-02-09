package snippets.classmethod;

public class LocalNoNameClassExample {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Success");
            }
        };

        runner.run();
    }
}
