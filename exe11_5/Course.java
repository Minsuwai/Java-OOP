package exe11_5;

import java.util.ArrayList;

public class Course {

	private String courseName;
	
	private ArrayList<Student> students;
	
	private int numberOfStudents = 0;
	
	//constructor
	public Course(String courseName) {
		
		this.courseName = courseName;
		students=new ArrayList<Student>();
	}

	public String getCourseName() {
		return courseName;
	}

	

	public ArrayList<Student> getStudents() {
		return students;
	}
	

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void addStudent(Student stu) {
		
		students.add(stu);
		numberOfStudents++;
	}
	
	public void dropStudents(String name) {
		
		boolean found = false;
		int i=0;
		
		while(!found && i<numberOfStudents) {
			
			if(this.students.get(i).getName().equals(name)) {
			
				found = true;
			}
			else
				i++;
		}
		
		if (found) {
			
			this.students.remove(i);
//			this.students.remove(this.students.get(i));
				numberOfStudents--;
			}
		
		
		else {
			System.out.println("Not Found.");
		}
		
	}
	
	
	public void displayCourse() {
		
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Number of Students: " + this.numberOfStudents);
		System.out.println("List of Students: ");
		
		for(int i=0; i<this.students.size(); i++) {
			
			System.out.println(students.get(i).toString());
		}
	}
	
}
