package domain;

import annotation.Check;

public class Calculator {
    @Check
    public void add(){
        String s=null;
        s.toString();
        System.out.println("1+0="+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-1="+(1-1));
    }
    @Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }
    @Check
    public void time(){
        System.out.println("1*0="+(1*0));
    }
}
