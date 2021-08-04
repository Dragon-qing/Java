package Demo01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date a=new Date();
        System.out.println(a);
        Date b=new Date(0L);
        System.out.println(b);
        System.out.println(b.getTime());
        SimpleDateFormat d=new SimpleDateFormat("yyyy年MM月dd日-HH时mm分ss秒");
        System.out.println(d.format(a));
    }
}
