package t1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份：");
        month=sc.nextInt();
        if(month>=1&&month<=3){
            System.out.println("该月份为春季");
        }else if(month>=4&&month<=6){
            System.out.println("该月份为夏季");
        }else if(month>=7&&month<=9){
            System.out.println("该月份为秋季");
        }else if(month>=10&&month<=12){
            System.out.println("该月份为冬季");
        }else{
            System.out.println("非法月份");
        }
    }
}
