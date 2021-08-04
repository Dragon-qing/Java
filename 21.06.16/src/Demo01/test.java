package Demo01;

public class test {
    public static void printAll(PrintAble p){
        p.print("helloWorld!!!");
    }

    public static void main(String[] args) {
        printAll(s-> System.out.println(s));
        MethodRerObject obj = new MethodRerObject();
        printAll(obj::printUpperCaseString);      //方法引用
    }
}
