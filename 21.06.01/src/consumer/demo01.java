package consumer;

import java.util.function.Consumer;

public class demo01 {
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("Tom",(String name)->{
           String s=new StringBuffer(name).reverse().toString();
            System.out.println(s);
        });
    }
}
