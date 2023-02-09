package snippets.array;

public class ArrayExample {
    public static void main(String[] args) {

        // 配列
        int[] intArray = {10, 20, 30, 40, 50};

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
        // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(intArray[5]);
    }
}
