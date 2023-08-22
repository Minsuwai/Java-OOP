package exe11_5;

public class Student {

	private String name;
	private String address;
	
	//constructor
	public Student() {
		
	}
	public Student(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		
		return "Name: "+ this.name + "\nAddress: " + this.address;
	}
	
}
