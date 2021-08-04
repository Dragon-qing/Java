package Demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReadertest {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("2.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
