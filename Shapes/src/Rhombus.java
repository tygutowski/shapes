import java.text.DecimalFormat;

//polygon
//parallelogram
//4 side
//rhombus has 45 degree angle
public class Rhombus extends Shape2D implements Polygon{ //
	double height;
	double sl;
	double aa;
	private DecimalFormat df = new DecimalFormat(".##");
	public static int amt = 0;
	Rhombus(double sideLength, double acuteAngle){
		amt++;
		height = sideLength * Math.sin(acuteAngle*Nonpolygon.PI/180);
		sl = sideLength;
		aa = acuteAngle;
	}
	String title = "Rhombus";
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
		return  ((height*sl)*100.0)/100.0;
	}
	public boolean isComposite() {
		return false;
	}
	public String toString(){
		String str = getName() + ":  " + "Side:  " + df.format(getBase()) + "  Height:  " + df.format(getHeight()) + "  Area:  " + df.format(getArea()) + "  Perimeter:  " + df.format(getPerimeter());
		if(isParrallelogram()){
			str += "   This is a parrallelogram";
		}
		return str;
	}
}
