package supplier2;

import java.util.function.Supplier;

public class demo02 {
    public static int max(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int []arr={100,200,-50,2,54};
        int m=max(()->{
           int i=arr[0];
            for (int i1 : arr) {
                if(i1>i)
                    i=i1;
            }
            return i;
        });
        System.out.println(m);
    }
}
