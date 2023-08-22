package interface_example;

public class Student implements Comparable <Student> { //<Object Name>
	
	private String name;
	private int totalmarks;
	
	public Student(String name, int total) {
		this.name=name;
		this.totalmarks=total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", totalmarks=" + totalmarks + "]";
	}

	@Override
	public int compareTo(Student stu2) { //s1.compareTo(s2)
		
		//return this.totalmarks-stu2.totalmarks; // Ascending order
		return stu2.totalmarks-this.totalmarks; // Descending order
	}

}
