import java.util.ArrayList;

public class ShapeTester{
	public static void main(String args[]){
		ArrayList<Shape2D> list = new ArrayList<Shape2D>();
		list.add(new Rectangle(2.5,4));
		list.add(new Square(5.0));
		list.add(new Rhombus(10.0,30));
		list.add(new Rhombus(5.0,45));
		list.add(new Rhombus(20.0,60));
		list.add(new Ellipse(6.00,3.00));
		list.add(new Circle(8.0));
		
		System.out.println("There are " + list.size() + " 2D shapes.\n");
		System.out.println("There are " + list.size() + " Rhombi(us).\n");
		System.out.println("There are " + list.size() + " Ellipse(s).\n");
		System.out.println("There are " + list.size() + " Circle(s).\n");
		for(int i = 0; i < list.size(); i++){
			//There are x 2D shapes
			
			//Rectangle:  Length: 2.5  Width: 4.0  Area: 10.0
			//Rhombus:  Side: 10.0  Height: 5.0  Area: 50.0
			//Square:  Side: 5.0  Area: 25.0
			//Ellipse:  Major Axis: 6.0  Minor Axis: 3.0  Area: 14.0
			//Circle:  Diameter: 8.0  Radius: 4.0  Area: 50.0
			
			System.out.println(list.get(i).toString());
		}
	}
}