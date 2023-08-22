package animal;

public class Cat extends Pet{
	
	private String coatColor;
	
	public Cat(String name)
	{
		super(name);
	}
	
	public Cat(String name, String color)
	{
		super(name);
		this.coatColor = color;
		
	}

	public String speak() {
		
		return "Don't give me orders.\n"+"I speak only when I want to.";
	}
	
	public String toString() {
		
		return "Name : " + this.name+ "\n Color :" + this.coatColor + "\n";
	}

	public String getCoatColor() {
		return coatColor;
	}

	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}
}
