package inheritanceProtected;

import java.util.Date;

public class GeometricObject {

	protected String color;
	protected boolean filled;
	protected Date dateCreated;
	
	public GeometricObject()
	{
	dateCreated=new Date();
	}
	
	public GeometricObject(String color, boolean filled)
	{
		this.color=color;
		this.filled=filled;
		dateCreated=new Date();
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public String toString()
	{
		return "Created on "+dateCreated+"\nColor :"+color+"\nFilled: "+filled;
	}
	
}

