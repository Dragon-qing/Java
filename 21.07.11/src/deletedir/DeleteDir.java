package deletedir;

import java.io.File;

public class DeleteDir {
    public static boolean deleteDIR(File name){
        if(name.isDirectory()){
            String []arr=name.list();
            for (String s : arr) {
                boolean success = deleteDIR(new File(name, s));
                if(!success) System.out.println(s+"删除失败！");
                else{
                    System.out.println(s+"已删除");
                }

            }
        }
        if(name.getName().endsWith(".cpp")||name.getName().endsWith(".h")||name.getName().endsWith(".txt")||name.getName().endsWith(".dat")){return false;}
        return name.delete();
    }

    public static void main(String[] args) {

        deleteDIR(new File("D:\\code\\vs\\visual studio的代码"));
    }
}
