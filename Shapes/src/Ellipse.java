//nonpolygon
//PI/4*majoraxis*minoraxis = area

public class Ellipse extends Shape2D implements Nonpolygon{ //maj of 6 min of 3
	double ma;
	double mi;
	Ellipse(double majAxis, double minAxis){
		ma = majAxis;
		mi = minAxis;
	}
	String title;
	public void setName(String name){
		title = name;
	}
	public String getName(){
		return title;
	}
	public double getLengMajAxis(){
		return 1;
	}
	public double getLengMinAxis(){
		return 1;
	}
	public double getCircumference(){
		return 2*PI*Math.sqrt(  ((1/2*ma)*(1/2*ma))   +   ((1/2*mi)*(1/2*mi))  )/2;
		}
	public double getArea(){
		return PI*ma*mi;
	}
	public boolean isComposite() {
		return false;
	}
}
