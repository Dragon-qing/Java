package Demo02;
import java.util.ArrayList;
import java.util.Collections;

public class poker {
    public static void main(String[] args) {
        ArrayList<String> pokers=new ArrayList<>();
        String []colors={"♥","♦","♣","♠"};
        String []numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        pokers.add("大王");
        pokers.add("小王");
        for (String color : colors) {
            for (String number : numbers) {
                pokers.add(color+number);
            }
        }
        Collections.shuffle(pokers);//随机打散
        ArrayList<String>player01=new ArrayList<>();
        ArrayList<String>player02=new ArrayList<>();
        ArrayList<String>player03=new ArrayList<>();
        ArrayList<String>dipai=new ArrayList<>();
        for(int i=0;i<pokers.size();i++){
            String p=pokers.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);
            }else if(i%3==2){
                player03.add(p);
            }
        }
        System.out.println(dipai);
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
    }
}
