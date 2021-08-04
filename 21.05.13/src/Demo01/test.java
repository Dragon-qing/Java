package Demo01;

public class test {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(){
            @Override
            public void run() {
                System.out.println("告诉要的包子数量");
                synchronized (obj){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("eating.....");
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("包子需要5秒");
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obj.notify();
                    System.out.println("制作完成！！");
                }
            }
        }.start();
    }
}
