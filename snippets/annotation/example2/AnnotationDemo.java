package snippets.annotation.example2;

// 自作したアノテーションを付与するためのクラス
// クラスにアノテーション付与するパターン
@MyAnnotation(name="class", value=1)
public class AnnotationDemo {

    // フィールドにアノテーションを付与するパターン
    @MyAnnotation(name="field", value=2)
    private String name;

    // コンストラクタにアノテーションを付与するパターン
    @MyAnnotation(name="constructor", value=3)
    public AnnotationDemo() {}

    // メソッドにアノテーションを付与するパターン
    @MyAnnotation(name="method", value=4)
    public void execute() {
        System.out.println("execute");
    }
}
