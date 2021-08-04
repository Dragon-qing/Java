package Demo01;

public class Person {
    public static <E> E method(E e){
        System.out.println(e);
        return e;
    }
}
