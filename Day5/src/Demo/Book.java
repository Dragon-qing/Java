package Demo;

public class Book {
    private String name;
    public Book(){
        System.out.println("HH");
    }
    {
        System.out.println("hello");
    }
    static{
        System.out.println("aaaa");
    }
    public String getName(){
        int id=0;
        setName("java");
        return id+this.name;
    }
    private void setName(String name){
        this.name=name;
    }
    public Book getBook(){
        return this;
    }
}
