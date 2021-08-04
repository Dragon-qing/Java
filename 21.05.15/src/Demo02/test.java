package Demo02;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args)throws IOException {
        File f1=new File("a.txt");
        File f2=new File("a//b//v//c//d");
        File f3=new File("111222333");
        f1.delete();
        f2.delete();
        f3.delete();

    }
}
