package Demo04;

public class test {
    public static void main(String[] args) {
        calcul(3,5,( a, b)-> a+b);
    }
    public static void calcul(int a,int b,Calculator c){
        int re=c.cal(a,b);
        System.out.println("a+b="+re);
    }
}
