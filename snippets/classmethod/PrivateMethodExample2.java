package snippets.classmethod;

public class PrivateMethodExample2 {
    public static void main(String[] args) {
        int result = add(20, 30);
        System.out.println(result);
    }
    
    private static int add(int a, int b) {
        return a + b;
    }
}
