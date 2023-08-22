package inheritance;

import object_class.Circle;

public class Shape_App {

	public static void main(String[] args) {
		
		// create object or instance
		Circle c1 = new Circle();
		
		//c1.radius = 1.5;
		//c1.setRadius(1.5);
		//c1.setColor("Red");
		//c1.setFilled(true);
		c1.setColor("Red");
		
		System.out.println("C1 radius = " + c1.radius);
		//System.out.println("C1 radius = " + c1.getRadius();
		//System.out.println("C1 radius = " + c1.toString();
		System.out.println("C1 Area = " + c1.getArea());
		System.out.println();
		
		Circle c2 = new Circle();
		
		c2.radius = 3;
		
		System.out.println("C2 radius = " + c2.radius);
		System.out.println("C1 Area = " + c2.getArea());
		System.out.println();
		
		Circle c3 = new Circle(3.5);
		
		System.out.println("C3 radius = " + c3.radius);
		System.out.println("C1 Area = " + c3.getArea());
		
		System.out.println();
		System.out.println("Total Circle = " + Circle.getTotalCircle()); // using object(Circle.getTotalCircle) is better
		
//		Rectangle r1 = new Rectangle();
//		r1.setHight(3.5);
//		r1.setWidth(7.5);
//		
//		System.out.println("R1 Width = " + r1.getWidth());
//		System.out.println("R1 Hight = " + r1.getHight());
//		System.out.println("R1 Area = " + r1.getArea());
//		
//		Rectangle r2 = new Rectangle(5.5,3.5)
		

	}

}
