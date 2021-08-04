package Demo03;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Person[] p={
          new Person("Tom",18),
          new Person("Micheal",25),
          new Person("Jam",10)
        };
        /*Arrays.sort(p,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        });*/
        Arrays.sort(p,(Person o1,Person o2)->{
           return o2.age-o1.age;
        });
        for (Person person : p) {
            System.out.println(person);
        }
    }
}
