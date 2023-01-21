package snippets;

public class LocalNoNameClassDemo {
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
