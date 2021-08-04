package Consumertest;

import java.util.function.Consumer;

public class test1 {
    public static void method(String[]arr, Consumer<String>c1,Consumer<String>c2){
        for (String s : arr) {
            c1.andThen(c2).accept(s);
        }
    }
    public static void main(String[] args) {
        String []arr={"Tom,男","JACK,女","candy,女"};
        method(arr,(t)->{
            String name=t.split(",")[0];
            System.out.print("姓名："+name);
        },(t)->{
            String sex=t.split(",")[1];
            System.out.println("性别："+sex);
        });
    }
}
