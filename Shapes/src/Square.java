//polygon
//parallelogram
//square is rectangle
//regular
//congruentdiag
//4 side
public class Square extends Rectangle{ //side length of 5
	String title;
	double sl;
	double area;
	Square(double sideLength){
		super(sideLength, sideLength);
		area = sideLength*sideLength;
	}
	
	public void setName(String name){
		title = name;
	}
	public String getName(){
		return title;
	}
	public double getBase(){
		return sl;
	}
	public double getHeight(){
		return sl;
	}
	public double getPerimeter(){
		return sl*4;
	}
	public boolean isRegular(){
		return true;
	}
	public boolean congruentDiag(){
		return true;
	}
	public boolean isParrallelogram(){
		return true;
	}
	public double getArea() {
		return area;
	}
	public boolean isComposite() {
		return false;
	}
}
