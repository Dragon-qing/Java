package Demo01;
import java.util.Arrays;
public class test {

    public static void main(String[] args){
        char[]arr=new char[]{};
        System.out.println(arr.length);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {

                    int t = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = t;
                }
            }
        }
    }
}