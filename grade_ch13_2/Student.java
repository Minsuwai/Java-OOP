package grade_ch13_2;

public class Student {
	
	// constant variable
	public final static int NUM_OF_TESTS=3; // final 
	
	protected String name; //task
	protected int[] test;
	protected String courseGrade;
	
	// 0-argument constructor
	public Student() {
		this("No name"); // constructor chaining 
	}
	
	// 1-argument constructor
	public Student(String name) {
		this.name = name;
		test = new int[NUM_OF_TESTS];
		courseGrade = "***";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestScore(int testNumber) {
		return test[testNumber-1];
	}

	public void setTestScore(int testNumber, int score) {
		this.test[testNumber-1] = score;
	}

	public String getCourseGrade() {
		return courseGrade;
	}

	public void computeCourseGrade() {
		
	}
	
	
	
	
	
}
