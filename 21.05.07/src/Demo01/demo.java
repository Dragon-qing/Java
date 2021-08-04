package Demo01;

import java.util.Objects;

public class demo {
    public static void main(String[] args) {
        Object obj=new Object();
        Objects.requireNonNull(obj,"指针为空");
    }
}
