package Count;

import java.util.ArrayList;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(16);
        list.add(15);
        Stream<Integer> stream = list.stream();
        long count=stream.count();
        System.out.println(count);
    }
}
