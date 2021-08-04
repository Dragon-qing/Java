package t5;

public class cylinder extends Circle{
private double h;
public cylinder(double r,double h) {
	super(r);
	this.h=h;
}
public double volume() {
	return super.area()*h;
}
}
