package Demo02;

public class chi extends Thread{
    private BaoZi b;
    public chi(BaoZi b){
        this.b=b;
    }

    @Override
    public void run() {
        while(true){

            synchronized (b){
                if(b.is==false){
                    try{
                        b.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("正在吃"+b.pi+b.xian+"包子");
                b.is=false;
                b.notify();
                System.out.println("-------------------------");
            }
        }
    }
}
