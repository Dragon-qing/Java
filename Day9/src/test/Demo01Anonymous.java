package test;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one=new Person();
        one.name="abc";
        one.showname();
        System.out.println("===========");
        new Person().name="aaa";//匿名对象
        new Person().showname();//null
    }
}
