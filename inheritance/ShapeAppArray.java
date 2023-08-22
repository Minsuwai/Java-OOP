package inheritance;

import object_class.Circle;

public class ShapeAppArray {

	public static void main(String[] args) {
		
		Circle[] circle = new Circle[3];
		Rectangle[] rec = new Rectangle[2];
		
		Circle c1 = new Circle();
		c1.radius = 1;
//		c1.setRadius(1.5);
//		c1.setColor("Red");
//		c1.setFilled(true);
		circle[0]=c1;
		
		Circle c2 = new Circle();
		c2.radius=3;
		circle[1]=c2;
		
		Circle c3 = new Circle();
		c3.radius=4;
		circle[2]=c3;
		
		Geometric_Object[] geo=new Geometric_Object[5];
		
		geo[0]=c1;
		geo[1]=c2;
		geo[2]=c3;
//		geo[3]=r1;
//		geo[4]=r2;
		
		for(int i=0;i<5;i++)
		{
			System.out.println(geo[i].toString());
			System.out.println();
		}
				
				
				
				

	}

}
