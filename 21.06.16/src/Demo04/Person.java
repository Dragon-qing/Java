package Demo04;

public class Person {
    String name;

    public Person() {
        name="空";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
