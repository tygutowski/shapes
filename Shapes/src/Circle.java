//circle is an ellipse
//PI/4*majoraxis^2 = area
public class Circle extends Ellipse { //rad 4
	double r;
	Circle(double radius){
		super(radius*2, radius*2);
	}
	String title;
	public void setName(String name){
		title = name;
	}
	public String getName(){
		return title;
	}
	public double getArea(){
		return PI/4*(r*r);
	}
	public boolean isComposite(){
		return false;
	}
}
