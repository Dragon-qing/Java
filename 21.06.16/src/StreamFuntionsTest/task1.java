package StreamFuntionsTest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("老子");
        one.add("洪七公");
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> two=new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯");
        Stream<String> twoStream = two.stream().filter(name -> name.length() == 3).skip(2);
        Stream.concat(oneStream, twoStream).map(name->new Person(name)).forEach(p-> System.out.println(p));
//        ArrayList<Person> allPerson=new ArrayList<>();
//        concat.forEach((String name)->{
//            allPerson.add(new Person(name));
//        });
//        for (Person person : allPerson) {
//            System.out.println(person);
//        }
    }
}
