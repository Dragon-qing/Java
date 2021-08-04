package Demo1;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);
        }
        System.out.println(list);
        for (Integer integer : list) {
            if(integer%2==0){
                System.out.print(integer+" ");
            }
        }
    }
}
