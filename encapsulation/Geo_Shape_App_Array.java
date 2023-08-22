package encapsulation;

import java.util.Scanner;

public class Geo_Shape_App_Array {

	public static void main(String[] args) {
		
		// int[] A=new int[5];
		
		Scanner input = new Scanner(System.in); // For input
		
		// Create Array
		Circle[] circle = new Circle[3];
		//Rectangle[] rec=new Rectangle[5];
		
		double r;
		for (int i=0; i<3; i++)
		{
			System.out.println("Enter radius for circle " + (i+1) + ":");
			r = input.nextDouble();
			
			circle[i] = new Circle(r);// Object Create
		}
		
//		for (int i=0; i<2; i++)
//		{
//			System.out.println("Enter width and hight for circle" + (i+1) + ":");
//			w = scan.nextDouble();
//			h = scan.nextDouble();
//			
//			rec[i] = new Rectangle(w,h);
//		}
		
		System.out.println("Circle");
		
		for (int i=0; i<3; i++)
		{
			circle[i].displayCircle();
		}
		
//		System.out.println("Rectangle");
//		
//		for (int i=0; i<3; i++)
//		{
//			circle[i].displayRectangle(null);
//		}
	}

}
