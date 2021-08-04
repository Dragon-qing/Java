package Demo;

public class OverLoad {
    public static void main(String[] args) {
        System.out.println(sum(10,2));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,5));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int...c){
        int sum=0;
        sum+=a;
        sum+=b;
        for(int x:c){
            sum+=x;
        }
        return sum;
    }
}
