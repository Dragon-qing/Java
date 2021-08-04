package Demo01;

public class Work extends Person{
    String id;

    public Work(String id) {
        this.id = id;
    }

    public Work(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }
    public String getId(){
        return id;
    }
}
