package t5;

public class test {
public static void main(String []args) {
	Circle c=new Circle(4);
	System.out.println("面积为："+String.format("%.2f",c.area()));
	cylinder cy=new cylinder(5,6.2);
	System.out.println("体积为："+String.format("%.2f",cy.volume()));
}
}
