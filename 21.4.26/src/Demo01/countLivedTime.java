package Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class countLivedTime {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入出生日期：yyyy-MM-dd");
        String birthday=sc.next();
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        Date br = sd.parse(birthday);
        long time=new Date().getTime()-br.getTime();
        System.out.println("到现在已经过了"+time/1000/60/60/24+"天");
    }
}
