package testCourse;

import java.util.Scanner;

public class CourseApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int choice;
		String cname, sname, addr;
		Course course;
		
		while(true) {
			
			System.out.println("Enter Course Name: ");
			cname = scan.next();
			
			course = new Course(cname);
			
			System.out.println("2: Add Student");
			System.out.println("3: Drop Student");
			System.out.println("0: Exit");
			choice = scan.nextInt();
			
			
			if (choice == 2) {
				
				System.out.println("Enter Student Name: ");
				sname = scan.next();
				
				System.out.println("Enter Address: ");
				addr = scan.next();
				
				Student s = new Student(sname, addr);
				
				course.addStudent(s);
			}
			
			else if (choice == 3) {
				
				System.out.println("Enter Student Name: ");
				sname = scan.next();
				
				course.dropStudents(sname);
				course.displayCourse();
				
			}
			else if(choice ==0) {
				System.exit(0);
			}
		
		}
		
		
		
		
		
		

	}

}
