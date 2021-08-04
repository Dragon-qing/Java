package StreamTool;

import java.util.stream.Stream;

public class skipTest {
    public static void main(String[] args) {
        String []arr={"123","1234","222"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(2);
        stream1.forEach(name-> System.out.println(name));
    }
}
