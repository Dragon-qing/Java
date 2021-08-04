package Demo1;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        boolean success =list.add("张三");
        System.out.println(list);
        System.out.println("添加是否成功"+success);
        list.add("abc");
        String s=list.get(1);
        System.out.println(s);
        s=list.remove(1);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

        }
    }
}
