package grade_ch13_2;

public class Graduate_Student extends Student {
	
	public void computerGrade() {
		
		int total = 0;
		for(int i=0; i<NUM_OF_TESTS; i++)
		{
			total += test[i];
		}
		
		if (total/NUM_OF_TESTS >= 80) {
			courseGrade = "Pass";
			
		}
		else {
			courseGrade = "NO Pass";
		}
		
	}
	
	
}
