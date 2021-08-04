package FunctionDeom;

import java.util.function.Function;

public class test {
    public static void method(String s, Function<String,Integer>f){
        int i=f.apply(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        method("123",(String s)->{
           return Integer.parseInt(s);
        });
    }
}
