package Demo02;

public class demo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                System.out.println(currentThread().getName()+"hello");
            }
        }.start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1;i<=10;i++)
                System.out.println(Thread.currentThread().getName()+"Runable");
            }
        }).start();
    }
}
