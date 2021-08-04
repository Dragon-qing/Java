package t3;

public class Worker {
private String name;
private int wno;
private double salary;
public Worker(String name, int wno, double salary) {
	this.name = name;
	this.wno = wno;
	this.salary = salary;
}
public Worker() {
	this("",0,0);
}
@Override
public String toString() {
	return "name=" + name + ", wno=" + wno + ", salary=" + salary ;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getWno() {
	return wno;
}
public void setWno(int wno) {
	this.wno = wno;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
