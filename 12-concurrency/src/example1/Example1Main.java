package example1;

import java.io.IOException;

public class Example1Main {

    public static void main(String[] args) {

        FileProcessor fp = new FileProcessor("large-file");

        Thread t = new Thread() {
            public void run() {
                try {
                    fp.countLines();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();

        System.out.println("--- After count lines");

        //
    }

}
