package reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class<Person> cla1 = Person.class;
//        Field[] fields = cla1.getDeclaredFields();
//        String name = cla1.getName();
//        System.out.println(name);
//        Method[] methods = cla1.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//
//        }
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        Constructor<Person> constructor = cla1.getConstructor(String.class,int.class);
        Method eat = cla1.getMethod("eat");
        Person p=constructor.newInstance("1",12);
        eat.invoke(p);
        System.out.println(p);
    }
}
