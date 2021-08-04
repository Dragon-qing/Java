package Demo01;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f1=new File("D:\\code\\Idea\\21.05.15\\a.txt");
        File f2=new File("a.txt");
        String str=f1.getName();
        System.out.println(str);
        str=f2.getName();
        System.out.println(str);
        File f3=new File("D:\\1.jpg");
        System.out.println(f3.length());
    }

}
