package demo02;

import java.util.ArrayList;

public class RedBag {
    public static void main(String[] args) {
        Manager m=new Manager("aa",100);
        Member a=new Member("a",0);
        Member b=new Member("b",0);
        Member c=new Member("c",0);
        m.show();
        a.show();
        b.show();
        c.show();
        System.out.println("===================");
        ArrayList<Integer>list =new ArrayList<>();
        list=m.send(20,3);
        a.receive(list);
        b.receive(list);
        c.receive(list);
        m.show();
        a.show();
        b.show();
        c.show();

    }
}
