package Demo01;

public class test {
    public static void show( meth m){
        m.sum();
    }

    public static void main(String[] args) {
        show(()->System.out.println("hello"));
    }
}
