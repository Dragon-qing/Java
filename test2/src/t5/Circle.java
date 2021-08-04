package t5;

public class Circle extends point {
	private double r;
	public Circle(int x,int y,double r) {
		super(x,y);
		this.r=r;
	}
	public Circle(double r) {
		super();
		this.r=r;
	}
	public double area() {
		return Math.PI*r*r;
	}
}
