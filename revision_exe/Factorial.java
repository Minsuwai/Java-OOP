/*
 * Write a fragment of Java code to generate the factorial of n until the factorial reaches 120. Your output should below:
 * 
 * 0! = 1
 * 1! = 1
 * 2! = 2
 * 3! = 6
 * 4! = 24
 * 5! = 120
 */

package revision_exe;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("0! = 1");
		int num=1, fact=1;
		
		do {
			fact=1;
			
			for(int i=1; i<=num; i++) 
				fact*=i;
				
			System.out.println(num+"!= "+fact);
			num++;	
		}while(fact<120);
		
//		while(fact < 120) {			
//			
//			fact = 1;
//			for(int i=1; i<=num; i++) 
//				fact*=i;
//				
//			System.out.println(num+"!= "+fact);
//			num++;	
//			
//		}
		

	}

}
