package Demo04;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

public class test {
    public static void main(String[] args) {
        File f=new File("D:\\code\\Idea\\21.05.15");
        getAllFile(f);
    }
    private static void getAllFile(File f){
//        System.out.println(f);
        File[] a=f.listFiles(pathname->
                     pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java")

        );
        for (File file : a) {
            if(file.isDirectory()){
                getAllFile(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
