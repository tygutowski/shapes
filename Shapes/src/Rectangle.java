//polygon
//parallelogram
//congruentdiag
//4 side
public class Rectangle extends Shape2D implements Polygon{//base of 2.5 height of 4
	double b;
	double h;
	Rectangle(double base, double height){
		b = base;
		h = height;
	}
	String title;
	public void setName(String name){
		title = name;
	}
	public String getName(){
		return title;
	}
	public double getBase(){
		return b;
	}
	public double getHeight(){
		return h;
	}
	public double getPerimeter(){
		return (h*2)+(b*2);
	}
	public int numSides(){
		return 4;
	}
	public boolean isRegular(){
		return false;
	}
	public boolean congruentDiag(){
		return true;
	}
	public boolean isParrallelogram(){
		return true;
	}
	public double getArea() {
		return b*h;
	}
	public boolean isComposite() {
		return false;
	}
}
