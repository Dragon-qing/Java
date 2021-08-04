package Deom02;
import java.util.Arrays;
public class Demo10 {
    public static void main(String[] args) {
       String str="avjksaoijfnlkhb";
       char[]arr=str.toCharArray();
       Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
