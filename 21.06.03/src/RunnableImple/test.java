package RunnableImple;

public class test {
    public static void main(String[] args) {
        RunnableImpl R1=new RunnableImpl();
        Thread t1=new Thread(R1);
        Thread t2=new Thread(R1);
        Thread t3=new Thread(R1);
        t2.setName("A");
        t1.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
    }
}
