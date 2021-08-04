package Demo1;

public class Student {
    private String name;
    private int age;
    private boolean male;

    public Student(){
        System.out.println("great!!!");
    }
    {
        System.out.println("HHHHHH!!!");
    }
    public void setMale(boolean b){
        male=b;
    }
    public boolean isMale(){
        return male;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
