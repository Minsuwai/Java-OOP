package comparator_Interface;

import java.util.Comparator;

public class SalePerson extends Employee implements Comparable<SalePerson>{

	private int commision;
	
	public SalePerson(String name, int age, int basicsalary, int commision) {
		super(name, age, basicsalary);
		this.commision=commision;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	@Override
	public int compareTo(SalePerson s) {
		
		return (this.getBasicsalary()+this.getCommision())-(s.getBasicsalary()+s.getCommision());
	}

	@Override
	public String toString() {
		return "SalePerson [commision=" + commision + ", name=" + name + ", age=" + age + ", basicsalary=" + basicsalary
				+ "]";
	}
	
	
}

class SortPersonByAge implements Comparator<SalePerson>{
	
	@Override
	public int compare(SalePerson o1, SalePerson o2) {
		
		return o1.getAge()-o2.getAge();
	}
}

class SortPersonByName implements Comparator<SalePerson>{

	@Override
	public int compare(SalePerson o1, SalePerson o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

	
