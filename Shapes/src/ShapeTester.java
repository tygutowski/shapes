import java.util.ArrayList;

public class ShapeTester {
	public static void main(String args[]){
		ArrayList<Shape2D> list = new ArrayList<Shape2D>();
		list.add(new Rectangle(4.00,5.00));
		list.add(new Square(4.00));
		list.add(new Rhombus(10.00,45.00));
		list.add(new Ellipse(4.00,2.00));
		list.add(new Circle(4.00));
		list.add(new Rectangle(4.00,2.00));
		list.add(new Ellipse(4.00, 4.00));
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getArea());
		}
	}
}