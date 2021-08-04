import java.util.Scanner;

public class t3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input");
        String s = scan.next();
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < s.length(); ++i) {
            if ((s.charAt(i) - 48) % 2 != 0) {
                ++x;
            } else if (s.charAt(i) == '0') {
                ++z;
            } else {
                ++y;
            }
        }

        System.out.println("奇数：" + x + "个");
        System.out.println("偶数：" + y + "个");
        System.out.println("0：" + z + "个");
    }
}
