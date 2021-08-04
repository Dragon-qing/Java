package t1;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        ArrayList<Animal> a=new ArrayList<>();
        Person p=new Person();
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            int x=r.nextInt(3);
            a.add(p.produceAnimal(x));
        }
        for (int i = 0; i < a.size(); i++) {
            a.get(i).cry();
        }
    }
}
