package demo01;

public class Outer {
    int num=10;
    public class Inner{
        int num=20;
        public void method(){
            int num=30;
            System.out.println("num="+num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
    public void method(){
        class Inner{
            int num=100;
        }
        System.out.println(new Inner().num);
    }
}
