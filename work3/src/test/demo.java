package test;

import java.util.Scanner;

public class demo {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int score;
        System.out.println("请输入分数");
        score=sc.nextInt();
        if(score>=90) {
            System.out.println("成绩为A");
        }else if(score<90&&score>=60) {
            System.out.println("成绩为B");
        }else if(score<60&&score>=0){
            System.out.println("成绩为C");
        }else {
            System.out.println("分数不合法");
        }
        sc.close();
    }
}

