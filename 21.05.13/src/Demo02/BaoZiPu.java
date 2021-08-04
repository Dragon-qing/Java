package Demo02;

public class BaoZiPu extends Thread{
    private BaoZi b;
    public BaoZiPu(BaoZi b){
        this.b=b;
    }

    @Override
    public void run() {
        int count=0;
        while(true){

            synchronized (b){
                if(b.is){
                    try {
                        b.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    b.pi="薄皮";
                    b.xian="三鲜馅";
                }else{
                    b.pi="冰皮";
                    b.xian="牛肉大葱馅";
                }
                count++;
                System.out.println("正在制作"+b.pi+b.xian+"包子");
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                b.is=true;
                b.notify();
                System.out.println("已经生产好了"+b.pi+b.xian+"包子");
            }
        }
    }
}
