package animal;

public class Pet {
	
	protected String name;
	
	public Pet(String name)
	{
		this.name = name;
	}
	
	public String speak() {
		
		return"I'm your cuddly little pet";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
