package Demo04;
public class RunnableImpl implements Runnable{
    private static int tickets=100;
    Object obj=new Object();
    @Override
    public void run() {
        while(true){
            payTicket();
        }
    }
    public static synchronized void payTicket()
    {
        {
            if (tickets > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->" + "正在卖第" + tickets + "张");
                tickets--;
            }
        }
    }
}
