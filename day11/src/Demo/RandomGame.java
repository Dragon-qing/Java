package Demo;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("请输入数字：");
            int guessNum = sc.nextInt();
            if (guessNum > randomNum) {
                System.out.println("太大了！！！");

            } else if (guessNum < randomNum) {
                System.out.println("太小了！！！");

            } else {
                System.out.println("恭喜你猜中了！！！");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
