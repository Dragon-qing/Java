package t6;

public class RunnableImpl implements Runnable{
    Object obj=new Object();
    int i;
    public RunnableImpl(int i){
        this.i=i;
    }
    public int geti(){
        return i;
    }
    @Override
    public void run() {
        while(i<=60){
            synchronized (obj){
                if(i<=60){
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                    i++;
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
