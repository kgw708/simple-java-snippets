package snippets.annotation.example1;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {

        // リフレクションでクラス名を指定して探す
        Class<?> clazz = Class.forName("snippets.annotation.example1.AnnotationDemo");

        // MyAnnotationクラスを指定して探す
        MyAnnotation myAnnotation = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.value());
    }
}
