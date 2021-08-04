package Demo1;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList();
        list.add("a");
        list.add("b");
        System.out.println(list);
        printArrayList(list);

    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.println(list.get(i)+'}');
            }else{
                System.out.print(list.get(i)+'@');
            }
        }
    }
}
