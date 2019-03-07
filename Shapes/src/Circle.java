//circle is an ellipse
//PI/4*majoraxis^2 = area
public class Circle extends Ellipse { //rad 4
	double r;
	String title = "Circle";
	Circle(double radius){
		super(radius*2, radius*2);
		r = radius;
	}

	public void setName(String name){
		title = name;
	}
	public String getName(){
		return title;
	}
	public double getArea(){
		return Math.round((PI*(r*r))*100.0)/100.0;
	}
	public boolean isComposite(){
		return false;
	}
	public double getCircumference(){
		return Math.round((2*PI*r)*100.0)/100.0;
	}
	public String toString(){
		return getName() + ":  " + "Diameter:  " + r*2 + "  Radius:  "  + r + "  Area:  " + getArea() + "  Circumference:  " + getCircumference();
	}
}
