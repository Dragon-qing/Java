package Demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Strongmen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a String:");
        String s=sc.next();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(map.containsKey(c)){
                int v=map.get(c);
                v++;
                map.put(c,v);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e);
        }
    }
}
