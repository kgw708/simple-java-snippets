package snippets.miniapp;

import java.text.DecimalFormat;

public class MemoryCheck {
    public static void main(String[] args) {
        System.out.println("Memory Info\n" + getMemoryInfo());
    }

    private static String getMemoryInfo() {
        DecimalFormat memoryFormat = new DecimalFormat("#,###KB");
        DecimalFormat ratioFormat = new DecimalFormat("##.#");
        long total = Runtime.getRuntime().totalMemory() / 1024;
        long free = Runtime.getRuntime().freeMemory() / 1024;
        long max = Runtime.getRuntime().maxMemory() / 1024;
        long used = total - free;
        double ratio = (used * 100 / (double) total);

        return "total = " + memoryFormat.format(total) + "\n"
            + "free = " + memoryFormat.format(free) + "\n"
            + "used = " + memoryFormat.format(used)
            + " (" + ratioFormat.format(ratio) + "%)\n"
            + "can use = " + memoryFormat.format(max);
    }
}
