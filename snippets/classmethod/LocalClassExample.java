package snippets.classmethod;

public class LocalClassExample {
    public static void main(String[] args) {
        class Local {
            public void run() {
                System.out.println("Success");
            }
        }

        Local local = new Local();
        local.run();
    }
}
