package snippets.miniapp.money;

public class MoneyCounter {

    public static final int[] YEN_TYPE = {
        10000, 5000, 1000, 500, 100, 50, 10, 5, 1
    };

    public static void main(String[] args) {
        int yen = 65535;
        countYen(yen, YEN_TYPE);
    }

    public static void countYen(int yen, int[] yenType) {
        int[] count = new int[yenType.length];

        for (int i = 0; i < yenType.length; i++) {
            while (yen >= yenType[i]) {
                yen -= yenType[i];
                count[i]++;
            }
            System.out.println(yenType[i] + "円 : " + count[i] + "枚");
        }
    }
}
