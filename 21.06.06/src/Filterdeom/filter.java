package Filterdeom;

import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "李娜", "张无忌");
        Stream<String> stream2 = stream.filter(name -> name.startsWith("张"));
        stream2.forEach(name-> System.out.println(name));
    }
}
