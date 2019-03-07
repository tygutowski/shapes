//nonpolygon
//PI/4*majoraxis*minoraxis = area

public class Ellipse extends Shape2D implements Nonpolygon{ //maj of 6 min of 3
	double ma;
	double mi;
	String title = "Ellipse";
	Ellipse(double majAxis, double minAxis){
		ma = majAxis;
		mi = minAxis;
	}

	public void setName(String name){
		title = name;
	}
	public String getName(){
		return title;
	}
	public double getLengMajAxis(){
		return ma;
	}
	public double getLengMinAxis(){
		return mi;
	}
	public double getCircumference(){
		return Math.round((2*PI*Math.sqrt(((ma*ma)+(mi*mi))/2)*100.0))/100;
		}
	public double getArea(){
		return Math.round((PI*ma*mi)*100.0)/100.0;
	}
	public boolean isComposite() {
		return false;
	}
	public String toString(){
		return getName() + ":  " + "Major Axis:  " + getLengMajAxis() + "  Minor Axis:  " + getLengMinAxis() + "  Area:  " + getArea() + "  Circumference:  " + getCircumference();
	}
}
