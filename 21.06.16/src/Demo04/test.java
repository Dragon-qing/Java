package Demo04;

public class test {
    public static void method(String name,Buildable p){
        Person per=p.buildPerson(name);
        System.out.println(per.getName());
    }

    public static void main(String[] args) {
        method("abc",Person::new);
    }
}
