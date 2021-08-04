package demo03;

public interface MyInterface {
    public static final int NUM =10;
    public abstract void method1();
    static void methodstatic(){
        System.out.println("staticmethod");
    }
    default void methoddeful(){
        System.out.println("default method");
    }

}
