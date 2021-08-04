package Consumertest;

import java.util.Locale;
import java.util.function.Consumer;

public class test {
    public static void method(String s,Consumer<String> c1,Consumer<String>c2)
    {
        c2.andThen(c1).accept(s);
    }

    public static void main(String[] args) {
        String s="hello";
        method(s,
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s.toLowerCase(Locale.ROOT));
                    }
                },
                (t) ->
                        System.out.println(t.toUpperCase()));
    }
}
