package Demo1;

public class Demo07 {
    public static void main(String[] args) {
        int []array={1,2,3};
        String s = fromString(array);
        System.out.println(s);

    }
    public static String fromString (int []array){
        String re="[";
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                re+="word"+array[i]+"]";
            }else{
                re+="word"+array[i]+"#";
            }
        }
        return re;
    }
}
