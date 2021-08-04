package StreamTool;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class limittest {
    public static void main(String[] args) {
        String []arr={"123","1234","222"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(2);
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
