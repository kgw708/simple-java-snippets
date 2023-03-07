package snippets.miniapp.timer;

import java.awt.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class ClockSample extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String args[]) {
        ClockSample clock = new ClockSample();
        clock.setBounds(100, 100, 200, 100);
        clock.setVisible(true);
    }

    public ClockSample() {
        ClockLabel label = new ClockLabel();
        this.add(label, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ClockLabel extends JLabel {
    private DateFormat df;

    public ClockLabel() {
        this.setFont(new Font("Dialog", Font.BOLD, 24));
        df = new SimpleDateFormat("HH:mm:ss");
        Timer t = new Timer();
        t.schedule(new ClockLabelTask(), 0, 1000);
    }

    public void setTime() {
        Calendar calendar = Calendar.getInstance(Locale.JAPAN);
        this.setText(df.format(calendar.getTime()));
    }

    class ClockLabelTask extends TimerTask {
        public void run() {
            setTime();
        }
    }
}
