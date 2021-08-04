package Demo01;

public class MyThread01 extends Thread {
    public MyThread01(String s){
        super(s);
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName());
    }
}
