package snippets.classmethod;

public class LocalClassWithImplementsExample {
    public static void main(String[] args) {
        class Local implements Runnable {
            @Override
            public void run() {
                System.out.println("Success");
            }
        }

        Runnable runner = new Local();
        runner.run();
    }
}
