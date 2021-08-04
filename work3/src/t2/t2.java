package t2;

public class t2 {
    public static void main(String[] args) {
        Hero gailun=new Hero();
        ADHero ad=new ADHero();
        APHero ap=new APHero();
        ADAPHero adap=new ADAPHero();
        gailun.kill(ad);
        gailun.kill(ap);
        gailun.kill(adap);
    }
}
