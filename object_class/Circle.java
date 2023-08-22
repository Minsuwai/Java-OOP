package object_class;

public class Circle {
	
	private static int totalCircle=0; //class variable
	
	// member data
	public double radius; // instance variable
	
	// constructor
	
	// 0-argument constructor // start when create object
	public Circle()
	{
		totalCircle++;
	}
	
	// 1-argument constructor
	public Circle(double r)
	{
		radius = r;
		totalCircle++;
	}
	
	// member function
	public double getArea()
	{
		return 3.142*radius*radius;
	}
	
	public double getPerimeter()	
	{
		return 2*3.142*radius;
	}
	
	public static int getTotalCircle()
	{
		return totalCircle;
	}

	public void setColor(String string) {
		
		
	}
}
