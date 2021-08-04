package t2;

public class MyRectangle {
private int xUp;
private int yUp;
private int xDown;
private int yDown;
public MyRectangle() {
	this(0, 0, 0, 0);
}
public MyRectangle(int xUp,int yUp,int xDown,int yDown) {
	this.xUp=xUp;
	this.xDown=xDown;
	this.yDown=yDown;
	this.yUp=yUp;
}
public int getW() {
	return Math.abs(xDown-xUp);
}
public int getH() {
	return Math.abs(yUp-yDown);
}
public int area() {
	return getW()*getH();
}
@Override
public String toString() {
	return "{W="+getW()+" H="+getH()+" area="+area()+"}";
}

}
