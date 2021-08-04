package StreamTool;

import java.util.function.Predicate;

public class perdicateTest {
    public static boolean method(String s, Predicate<String>p1,Predicate<String>p2){
        return p1.test(s)&&p2.test(s);
    }
    public static void main(String[] args) {
        boolean method = method("123",
                (String str) -> {
                    return str.startsWith("1");
                },
                (String str) -> {
                    return str.length() > 3;
                });
        System.out.println(method);
    }
}
