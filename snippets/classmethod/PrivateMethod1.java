package snippets.classmethod;

public class PrivateMethod1 {
    public static void main(String[] args) {
        sayGoodMorning();
        sayGoodAfternoon();
        sayGoodEvening();
    }

    private static void sayGoodMorning() {
        System.out.println("Good morning!");
    }

    private static void sayGoodAfternoon() {
        System.out.println("Good afternoon!");
    }

    private static void sayGoodEvening() {
        System.out.println("Good evening!");
    }
}
