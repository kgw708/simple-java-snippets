package snippets.classmethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

public class ExecuteProcessDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Windows only
        ProcessBuilder pb = 
            new ProcessBuilder(
                "cmd", "/C", "dir", "C:\\Program Files\\Java");
        Process p = pb.start();
        BufferedReader br = 
            new BufferedReader(
                new InputStreamReader(p.getInputStream()));
        Catcher c = new Catcher(br);
        c.start();
        p.waitFor();
        p.destroy();
        System.out.println(c.out.toString());
    }
}

class Catcher extends Thread {
    Reader in;
    StringWriter out = new StringWriter();

    public Catcher(Reader in) {
        this.in = in;
    }

    public void run() {
        try {
            int c = 0;
            while ((c = in.read()) != -1) {
                out.write((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
