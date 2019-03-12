import java.text.DecimalFormat;

//polygon
//parallelogram
//square is rectangle
//regular
//congruentdiag
//4 side
public class Square extends Rectangle{ //side length of 5
	String title = "Square";
	double sl;
	double area;
	private DecimalFormat df = new DecimalFormat(".##");
	Square(double sideLength){
		super(sideLength, sideLength);
		area = ((sideLength*sideLength)*100.0)/100.0;
		sl = sideLength;
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
	public String toString(){
		String str = getName() + ":  " + "Side:  " + df.format(getHeight()) + "  Area:  " + df.format(getArea()) + "  Perimeter:  " + df.format(getPerimeter());
		if(isParrallelogram()){
			str += "   This is a parrallelogram";
		}
		if(isRegular()){
			str += "   This shape is regular";
		}
		if(congruentDiag()){
			str += "   Diagonals congruent";
		}
		return str;
	}
}
