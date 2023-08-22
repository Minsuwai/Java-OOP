package interfaceStaff;

public class Employee {
	
	protected String name;
	protected int age;
	protected int basicsalary;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, int basicsalary) {
		this.name=name;
		this.age=age;
		this.basicsalary=basicsalary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}
}
