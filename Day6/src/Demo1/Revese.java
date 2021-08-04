package Demo1;

public class Revese {
    public static int[] Swap(int a,int b){
        int c=a;
        a=b;
        b=c;
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int min,max;
        for(min=0,max=a.length-1;min<max;min++,max--){
            int []swap=Swap(a[min],a[max]);
            a[min]=swap[0];
            a[max]=swap[1];
        }
        for(int b:a){
            System.out.println(b);
        }
    }
}
