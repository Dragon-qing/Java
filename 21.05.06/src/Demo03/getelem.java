package Demo03;

public class getelem {
    public static void main(String[] args) {
//        int []arr={1,5,2};
        int re;
        int []arr=null;
        re=gete(arr,3);
        System.out.println(re);
    }
    public static int gete(int []arr,int index){
        if(arr==null){
            throw new NullPointerException("空指针异常");
        }
        if(index<0||index>=arr.length){
            throw new IndexOutOfBoundsException("越界了！！！");
        }
        int re=arr[index];
        return re;
    }
}
