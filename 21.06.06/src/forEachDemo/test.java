package forEachDemo;

import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("tom", "jack", "michael", "jane");
        stream.forEach(name-> System.out.println(name));
    }
}
