package demo02;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalmoney,int n){
        ArrayList <Integer> list=new ArrayList<>();
        if(totalmoney>super.money){
            System.out.println("余额不足");
            return list;
        }
        super.setMoney(super.money-totalmoney);
        int avg=totalmoney/n;
        int rem=totalmoney%n;
        for (int i = 0; i < n-1; i++) {
            list.add(avg);
        }
        list.add(avg+rem);
        return list;
    }
}
