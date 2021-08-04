package t3;

public class Manager extends Worker{
private double bonus;

public Manager(String name, int wno, double salary, double bonus) {
	super(name, wno, salary);
	this.bonus = bonus;
}
public Manager() {
	this("",0,0,0);
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
@Override
public String toString() {
	return super.toString()+" bonus=" + bonus ;
}

}
