package interface_example;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1=new Student("Maung Maung",678);
		Student s2=new Student("Thuza",467);
		
		if(s1.compareTo(s2)>0)
			System.out.println("S1 is larger.");
		else
			System.out.println("S2 is larger.");

	}

}
