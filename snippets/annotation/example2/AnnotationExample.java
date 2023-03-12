package snippets.annotation.example2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 自作したアノテーションを付与したクラスをリフレクションにより動作確認する
public class AnnotationExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, SecurityException {

        // クラスに付与したアノテーションの取得
        Class<?> clazz = Class.forName("snippets.annotation.example2.AnnotationDemo");
        MyAnnotation myClass = (MyAnnotation) clazz.getAnnotation(MyAnnotation.class);
        System.out.println("Class : name = " + myClass.name() + ", value = " + myClass.value());

        // フィールドに付与したアノテーションの取得
        Field field = clazz.getDeclaredField("name");
        MyAnnotation myField = (MyAnnotation) field.getAnnotation(MyAnnotation.class);
        System.out.println("Field : name = " + myField.name() + ", value = " + myField.value());

        // コンストラクタに付与したアノテーションの取得
        Constructor<?> constructor = clazz.getConstructor();
        MyAnnotation myConstructor = (MyAnnotation) constructor.getAnnotation(MyAnnotation.class);
        System.out.println("Constructor : name = " + myConstructor.name() + ", value = " + myConstructor.value());

        // メソッドに付与したアノテーションの取得
        Method method = clazz.getMethod("execute");
        MyAnnotation myMethod = (MyAnnotation) method.getAnnotation(MyAnnotation.class);
        System.out.println("Method : name = " + myMethod.name() + ", value = " + myMethod.value());
    }
}
