package demo03;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(obj==this)return true;
        if(obj instanceof Person) {
            Person person = (Person) obj;
            boolean b=name.equals(person.name);
            return b;
        }
        return false;
    }

    public Person() {
    }
}
