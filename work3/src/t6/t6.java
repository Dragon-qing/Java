package t6;

public class t6 {
    public static void main(String[] args) {
        RunnableImpl r=new RunnableImpl(1);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.start();
        t2.start();
        while((r.geti())<=60){
            r.run();
        }
    }
}
