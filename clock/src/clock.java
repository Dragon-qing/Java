public class clock {
    //变量成员
    int hour;
   int minute;
   int second;
   //方法成员
    public void setTime(int newH,int newM,int newS)
    {
        hour=newH;
        minute=newM;
        second=newS;
    }
    public void showTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
    public static void main(String[]args)
    {
        clock aClock;
        aClock=new clock();
        aClock.setTime(10,20,59);
        aClock.showTime();
    }
}
