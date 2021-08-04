package demo02;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student a=new Student("wms",1);
        Student b= (Student) a.clone();
        b.setName("aaa");
        b.method();
        a.method();

    }
}
