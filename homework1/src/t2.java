import java.util.Scanner;

public class t2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input :");
        String s = scan.nextLine();

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ') {
                System.out.println(s.charAt(i));
            }
        }

    }
}
