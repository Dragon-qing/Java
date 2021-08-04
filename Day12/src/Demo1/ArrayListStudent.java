package Demo1;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
    ArrayList<Student> list=new ArrayList<>();
        Student one=new Student("a",15);
        Student two=new Student("B",18);
        list.add(one);
        list.add(two);
        System.out.println(list);

    }

}
