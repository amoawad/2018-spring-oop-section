package example1;

import java.io.*;

public class FileProcessor {

    String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public void countLines() throws IOException {
        System.out.println("Started counting lines");
        FileReader fr = new FileReader(new File(path));
        BufferedReader br = new BufferedReader(fr);

        long t = System.currentTimeMillis();
        int counter = 0;
        while(br.ready()) {
            br.readLine();
            counter++;
        }
        t = System.currentTimeMillis() - t;

        System.out.println("Time: " + t + " milliseconds");
        System.out.println("Lines count: " + counter);
     }
}
