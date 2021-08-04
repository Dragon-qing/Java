package Demo01;

public class test {
    public static void main(String[] args) {
        RunnalbeImpl a=new RunnalbeImpl();
        Thread s=new Thread(a);
        s.start();
    }
}
