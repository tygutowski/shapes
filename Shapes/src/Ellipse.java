import java.text.DecimalFormat;

//nonpolygon
//PI/4*majoraxis*minoraxis = area

public class Ellipse extends Shape2D implements Nonpolygon{ //maj of 6 min of 3
	double ma;
	double mi;
	String title = "Ellipse";
	public static int amt = 0;
	private DecimalFormat df = new DecimalFormat(".##");
	Ellipse(double majAxis, double minAxis){
		amt++;
		ma = majAxis;
		mi = minAxis;
		if(mi>ma){
			double temp = mi;
			mi = ma;
			ma = temp;
		}
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
		return  (2*PI*Math.sqrt((Math.pow(mi/2,2)+Math.pow(ma/2,2))/2)*100.0)/100;
		}
	public double getArea(){
		return  (((PI/4)*ma*mi)*100.0)/100.0;
	}
	public boolean isComposite() {
		return false;
	}
	public String toString(){
		String str = getName() + ":  " + "Major Axis:  " + df.format(getLengMajAxis()) + "  Minor Axis:  " + df.format(getLengMinAxis()) + "  Area:  " + df.format(getArea()) + "  Circumference:  " + df.format(getCircumference());
		return str;
	}
}
