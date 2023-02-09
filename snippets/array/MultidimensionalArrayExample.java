package snippets.array;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {

        // 多次元配列
        String[][] testScore = {
            { "国語", "80" },
            { "算数", "90" },
            { "理科", "70" },
            { "社会", "60" }
        };

        for (int i = 0; i < testScore.length; i++) {
            System.out.println(testScore[i][0] + "：" + testScore[i][1] + "点");
        }
    }
}
