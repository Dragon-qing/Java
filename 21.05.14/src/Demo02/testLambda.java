package Demo02;

public class testLambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
