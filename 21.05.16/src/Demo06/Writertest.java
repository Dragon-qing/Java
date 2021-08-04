package Demo06;

import java.io.FileWriter;
import java.io.IOException;

public class Writertest {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("c.txt");
        fw.write("abxd");
        fw.flush();
        fw.close();
    }
}
