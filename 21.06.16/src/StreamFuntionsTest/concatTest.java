package StreamFuntionsTest;

import java.util.stream.Stream;

public class concatTest {
    public static void main(String[] args) {
        String []s1={"1","12","123","1234","12345"};
        String []s2={"A","ab","abc","abcd"};
        Stream<String> stream1 = Stream.of(s1);
        Stream<String> stream2 = Stream.of(s2);
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name-> System.out.println(name));
    }
}
