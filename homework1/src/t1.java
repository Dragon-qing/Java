public class t1 {
    public static void main(String[] args) {
        String s;
        for(int i = 1; i <= 12; ++i) {
            for(int j = 1; j <= i; ++j) {
                s=String.format("%-2d*%-2d=%-6d",i,j,i*j);
                System.out.print(s);
            }
            System.out.println();
        }

    }
}