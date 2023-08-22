package inheritancePrivate;

public class Rectangle extends GeometricObject {
	
	private static int totalRectangle=0;
	
	//object variable or instance variable
	private double width=0.0;
	private double height=0.0;
	
	public Rectangle()
	{
		totalRectangle++;
	}
	
	public Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
		totalRectangle++;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea()
	{
		return width*height;
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
	}

	public static int getTotalRectangle()
	{
		return totalRectangle;
	}
	
	public void displayRectangle() 
	{
	System.out.println("Width="+getWidth());
	System.out.println("Height="+getHeight());
	System.out.println("Area="+getArea());
	System.out.println("Perimeter="+getPerimeter());
	System.out.println();
	}
}

