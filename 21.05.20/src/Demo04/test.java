package Demo04;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("gbk.txt"),"GBK");
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("utf_8.txt"),"UTF-8");
//        int len=0;
//        while((len=isr.read())!=-1){
//            osw.write(len);
//        }
//        isr.close();
//        osw.close();
        File f=new File("abc.txt");
        f.renameTo(new File("abc"+1+".txt"));
    }
}
