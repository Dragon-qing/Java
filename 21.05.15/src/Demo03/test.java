package Demo03;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f1=new File("D:\\code\\Idea\\21.05.15");
        String []str=f1.list();
        for (String fileName : str) {
            System.out.println(fileName);
        }
        System.out.println("-----------------------");
        File f2=new File("D:\\code\\Idea\\21.05.15");
        File []ff=f2.listFiles();
        for (File file : ff) {
            System.out.println(file);
        }
    }
}
