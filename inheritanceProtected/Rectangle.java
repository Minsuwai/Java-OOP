package inheritanceProtected;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
	
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
	
	public Rectangle(double width,double height,String color, boolean filled)
	{
		super(color,filled);
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
	@Override
	public String toString() 
	{
		return super.toString()+"\nWidth="+getWidth()+"\nHeight="+getHeight()+"\nArea="+getArea()+"\nPerimeter="+getPerimeter();
	
	}

	@Override
	public int compareTo(Rectangle r) {
		// TODO Auto-generated method stub
		return (int)((this.getArea()-r.getArea())*100);
	}
}

