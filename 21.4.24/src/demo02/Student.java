package demo02;

public class Student extends Person implements Cloneable {
    int id;
    public Student() {
    }
    public Student(String name, int id) {
        super(name);
        this.id = id;
    }
    public void method(){
        System.out.println(super.getName());
        System.out.println("id:"+this.id);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student obj=(Student)super.clone();
        return obj;
    }
}
