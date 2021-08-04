package t1;

public class Person{
    String name;
    public Person(){

    }
    public Person(String name){
        this.name=name;
    }
    public Animal produceAnimal(int a){
        Animal re;
        switch(a){
            case 0:
                re=new Cat();
                break;
            case 1:
                re=new Dog();
                break;
            case 2:
                re=new Sheep();
                break;
            default:
                re=null;
        }
        return re;
    }
}
