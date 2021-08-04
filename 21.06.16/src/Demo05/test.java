package Demo05;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static int[] method(int len,BuildArrable b){
        return b.buildArr(len);
    }

    public static void main(String[] args) {
        int []arr=method(10,int[]::new);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
