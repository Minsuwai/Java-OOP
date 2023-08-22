package inheritance;

import java.sql.Date;

public class Geometric_Object {

	//member data
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	// 0-argument constructor
	public Geometric_Object()
	{
		dateCreated = new Date(0);
	}
	
	//1-argument constructor
	
	public Geometric_Object(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		dateCreated = new Date(0);
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

	public String toString() // to display their data
	{
		return "Created on " + dateCreated + "\nColor : " + color + "\nFilled : " + filled; 
	}
	
	
	
}
