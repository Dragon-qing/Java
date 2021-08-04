package t1;

public class t1 {
    public static void main(String []args) {
        for(int i=7, j=0;i>0;i-=2,j++) {
            for(int x=0;x<j;x++) {
                System.out.print(" ");
            }
            for(int y=0;y<i;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
