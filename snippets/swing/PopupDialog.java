package snippets.swing;

import javax.swing.JOptionPane;

public class PopupDialog {
    public static void main(String[] args) {
        try {
            "".charAt(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "処理中に例外が発生しました。");
        }
    }
}
