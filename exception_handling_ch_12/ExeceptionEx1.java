package exception_handling_ch_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeceptionEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, result;
		
		while(true) {
		
			System.out.println("Enter num 1: ");
			
			
			try {
				num1 = scan.nextInt();
				break;
			}
			catch(Exception e) {
				scan.next(); //remove garbage
				System.out.println("Only accept Number");
			}
		}
		
		while(true)
		{
		
			System.out.println("Enter num 2: ");
			
			
			try {
				num2 = scan.nextInt();
				result = num1/num2;
				break;
			}
			
			catch(InputMismatchException e2) {
				scan.next(); //remove garbage
				System.out.println("Only accept Number");
			}
			
			catch(Exception e1) {
				//System.out.println(e); 
				System.out.println("Not Divisible by zero!\nTry Again!\n");
				
			}
		
		}
		
		System.out.println("Result = "+result);
	}

}
