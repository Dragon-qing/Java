package demo02;

public class User {
    String name;
    int money;
    public void show(){
        System.out.println("姓名："+name+"余额："+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }
}
