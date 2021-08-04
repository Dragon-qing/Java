package Demo02;

public class test {
    public static int method(Calcable a,int n){
        return a.calAbs(n);
    }

    public static void main(String[] args) {
        int sum=method(Math::abs,-10);
        System.out.println(sum);
    }
}
