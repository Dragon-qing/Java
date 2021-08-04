package PredicateDemo;

import java.util.function.Predicate;

public class Deom {
    public static boolean method(String s, Predicate<String>p,Predicate<String>p2){
        return p.and(p2).test(s);
    }

    public static void main(String[] args) {
        boolean b=method("123455",(String s)->{
           return s.length()>5 ;
        },(t)->{
            return t.contains("1");
        });
        System.out.println(b);
    }
}
