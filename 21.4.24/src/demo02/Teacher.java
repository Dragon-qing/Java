package demo02;

public class Teacher extends Person{
    int workid;

    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    public Teacher(){
        super();

    }
    public Teacher(String name,int workid){
        super(name);
        this.workid=workid;
    }


}
