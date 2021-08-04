package demo01;

public class test {
    public static void main(String[] args) {
        Outer.Inner i=new Outer().new Inner();
        i.method();
        Outer o=new Outer();
        o.method();
        USB u=new USB() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };
        u.method();
    }
}
