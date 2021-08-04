import java.util.Vector;
import java.util.ArrayList;
public class Trimedemo {
    public static void main(String[] args) {
        String s=" 123 456 ";
        System.out.println(s);
        s=s.trim();
        System.out.println(s);
       int [][]a=new int [2][];
       a[0]=new int [2];
       a[1]=new int[5];
        for(int i=0;i<a.length;++i) {
            for (int j = 0; j < a[i].length; ++j)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        Vector v=new Vector();
        v.add(1);
        System.out.println(v);
        ArrayList<String> arr=new ArrayList<String>();
    }

}
