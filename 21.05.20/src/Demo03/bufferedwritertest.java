package Demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class bufferedwritertest {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("2.txt"));
        for(int i=0;i<10;i++){
        bw.write("wmx"+i);
        bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
