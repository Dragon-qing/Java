package demo02;

public class Person implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }
}
