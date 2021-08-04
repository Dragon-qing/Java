package Demo1;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(32)+1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
