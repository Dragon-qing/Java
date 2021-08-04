package supplier;

import java.util.function.Supplier;

public class demo {
    public static String getstring(Supplier<String> s){
        return s.get();
    }

    public static void main(String[] args) {
        String s=getstring(new Supplier<String>() {
            @Override
            public String get() {
                return "hello";
            }
        });
        System.out.println(s);
    }
}
