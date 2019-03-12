import java.util.ArrayList;

public class ShapeTester{
	public static void main(String args[]){
		ArrayList<Shape2D> list = new ArrayList<Shape2D>();
		list.add(new Rectangle(5,4));
		list.add(new Rectangle(4,5));
		list.add(new Rhombus(12,50));
		list.add(new Rhombus(15,45));
		list.add(new Rhombus(2,55));
		list.add(new Square(8));
		list.add(new Square(4));
		list.add(new Square(1));
		list.add(new Ellipse(16,3));
		list.add(new Ellipse(3,16));
		Ellipse roundie = new Circle(Nonpolygon.PI);
		list.add(roundie);
		
		System.out.print("There are " + list.size() + " 2D shapes.		");
		System.out.print("There are " + Rhombus.amt  + " Rhombi(us).		");
		System.out.print("There are " + Ellipse.amt  + " Ellipse(s).		");
		System.out.print("There are " + Circle.amt + " Circle(s).\n\n");
		
		for(int i = 0; i < list.size(); i++){	
			System.out.println(list.get(i).toString());
		}
	}
}