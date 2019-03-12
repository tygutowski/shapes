import java.text.DecimalFormat;

//circle is an ellipse
//PI/4*majoraxis^2 = area
public class Circle extends Ellipse { //rad 4
	double r;
	String title = "Circle";
	public static int amt = 0;
	private DecimalFormat df = new DecimalFormat(".##");
	Circle(double radius){
		super(radius*2, radius*2);
		amt++;
		r = radius;
	}

	public void setName(String name){
		title = name;
	}
	public String getName(){
		return title;
	}
	public double getArea(){
		return  ((PI*(r*r))*100.0)/100.0;
	}
	public boolean isComposite(){
		return false;
	}
	public double getCircumference(){
		return  ((2*PI*r)*100.0)/100.0;
	}
	public String toString(){
		return getName() + ":  " + "Radius:  " + df.format(r) + "  Diameter:  "  + df.format(r*2) + "  Area:  " + df.format(getArea()) + "  Circumference:  " + df.format(getCircumference());
	}
}
