package Demo05;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    String sex;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }
}
