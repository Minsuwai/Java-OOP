package polymorphism;

import object_class.Circle;

public class Shape_App {

	public static void main(String[] args) {
		
		// create object or instance
		Geometric_Object c1 = new Circle(1.5);
		c1.setColor("Red");
		c1.setFilled(true);
		
		Geometric_Object c3 = new Circle(3.5);
		
		public static void display(Geometric_Object obj);{
			System.out.println(obj.toString());
		}

	}

}
