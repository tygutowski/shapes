//polygon
//parallelogram
//4 side
//rhombus has 45 degree angle
public class Rhombus extends Shape2D implements Polygon{ //
	double height;
	double sl;
	double aa;
	Rhombus(double sideLength, double acuteAngle){
		height = sideLength * Math.sin(acuteAngle*Nonpolygon.PI/180);
		sl = sideLength;
		aa = acuteAngle;
	}
	String title;
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
		return height;
	}
	public double getPerimeter(){
		return sl*4;
	}
	public int numSides(){
		return 4;
	}
	public boolean isRegular(){
		return false;
	}
	public boolean congruentDiag(){
		return false;
	}
	public boolean isParrallelogram(){
		return true;
	}
	public double getArea() {
		return height*sl;
	}
	public boolean isComposite() {
		return false;
	}
}
