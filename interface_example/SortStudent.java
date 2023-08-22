package interface_example;

import java.util.Arrays;

public class SortStudent {

	public static void main(String[] args) {
		
		Student[] StuArr = new Student[3];
		StuArr[0] = new Student("Aung Aung", 567);
		StuArr[1] = new Student("Su Hlaing", 450);
		StuArr[2] = new Student("Thuza", 595);
		
		Arrays.sort(StuArr);
		for(Student stu:StuArr) {
			System.out.println(stu.toString());
		}

	}

}
