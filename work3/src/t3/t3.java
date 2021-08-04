package t3;

public class t3 {
    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer("Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak");
        int ind=sb.lastIndexOf("two");
        sb.replace(ind,ind+1,"T");
        System.out.println(sb.toString());
    }
}
