package animal;

public class Dog extends Pet{
	
	private double weight;
	
	public Dog(String name)
	{
		super(name);
	}
	
	public Dog(String name, double weight)
	{
		super(name);
		this.weight = weight;
	}
	
	public String fetch() {
		
		return "Yes, master. Fetch I will.";
	}
	
	public String toString() {
		
		return "Name : " + this.name+ "\n Weight :" + this.weight + "\n";
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
