package grade_ch13_2;

import java.util.Scanner;

public class Grade_App extends Student{
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int score;
		
		Undergraduate stu1 = new Undergraduate();
		
		
		stu1.setName("Aung Aung");
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter test score for test "+(i+1)+": ");
			score=scan.nextInt();
			
			stu1.setTestScore(i+1,score);
		}
		
		stu1.computeCourseGrade();
		
		System.out.println("Student 1 info: ");
		System.out.println("Name ="+stu1.getName());
		for(int i=0; i<3; i++)
		{
			System.out.println("Test "+i+":"+stu1.getTestScore(i));
			
		}
		System.out.println("Grade ="+stu1.getCourseGrade());
		
		
	}

}
