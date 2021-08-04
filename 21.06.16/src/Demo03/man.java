package Demo03;

public class man{
    public void sayHello() {
        System.out.println("你好");
    }
    public static void method(Greetable g){
        g.greet();
    }
    public void show(){
        method(this::sayHello);
    }
    public static void main(String[] args) {
        new man().show();
    }
}
