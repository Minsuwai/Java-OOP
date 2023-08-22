package testCourse;

public class Course {

	private String courseName;
	
	private Student[] students = new Student[10];
	
	private int numberOfStudents = 0;
	
	//constructor
	public Course(String courseName) {
		
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	

	public Student[] getStudents() {
		return students;
	}
	

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void addStudent(Student stu) {
		
		students[numberOfStudents] = stu;
		numberOfStudents++;
	}
	
	public void dropStudents(String name) {
		
		boolean found = false;
		int i=0;
		
		while(!found && i<numberOfStudents) {
			
			if(students[i].getName() .equals(name)) {
			
				found = true;
			}
			else
				i++;
		}
		
		if (found) {
			
			for(int j=i; j<numberOfStudents-1; j++) {
				
				students[j] = students[j+1];
				numberOfStudents--;
			}
		}
		
		else {
			System.out.println("Not Found.");
		}
		
		
	}
	
	public void displayCourse() {
		
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Number of Students: " + this.numberOfStudents);
		System.out.println("Name of Students: ");
		
		for(int i=0; i<this.numberOfStudents; i++) {
			
			System.out.println(students[i].getName());
		}
	}
	
}
