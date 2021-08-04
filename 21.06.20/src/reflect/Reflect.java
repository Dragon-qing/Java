package reflect;

import domain.Person;

public class Reflect {
    public static void main(String[] args) throws Exception {
        //1
        Class cls1 = Class.forName("domain.Person");
        System.out.println(cls1);
        //2
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        //3
        Person p=new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

    }
}
