package exe11_5;

import java.util.Scanner;

public class CourseApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scan_1 = new Scanner(System.in);
		Scanner scan_2 = new Scanner(System.in);
		int choice;
		String cname, sname, addr;
		Course course;
		
		System.out.println("Enter Course Name: ");
		cname = scan.nextLine();
		
		
		course = new Course(cname);
		while(true) {			
			
			System.out.println("1: Add Student");
			System.out.println("2: Drop Student");
			System.out.println("3: Display Student");
			System.out.println("0: Exit");
			choice = scan.nextInt();
			
			
			if (choice == 1) {
				
				System.out.println("Enter Student Name: ");
				sname = scan_1.nextLine();
				//scan.nextLine();
				
				System.out.println("Enter Address: ");
				addr = scan_2.nextLine();
				
				Student s = new Student(sname, addr);
				
				course.addStudent(s);
				
				
			}
			
			else if (choice == 2) {
				
				System.out.println("Enter Student Name: ");
				sname = scan.next();
				
				course.dropStudents(sname);
				
				
			}
			else if (choice == 3) {
				course.displayCourse();
			}
			else if(choice ==0) {
				System.exit(0);
			}
		
		}		

	}

}
