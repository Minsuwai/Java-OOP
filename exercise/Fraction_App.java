/*
 * Class Fraction
 * variable --> numerator and denominator
 * method --> addFraction
 * 			  subFraction
 * 			  mulFraction
 * 			  divFraction
 * 
 * User class
 * input --> 2 fractions
 * input operation(+, -, *, /)
 * 
 * output --> Result Fraction
 */
package exercise;

import java.util.Scanner;

public class Fraction_App {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Select the method (+,-,*,/)");
		
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new Fraction(5,7);		
		Fraction f3 = new Fraction(); // call 0-argument constructor
		
		f3.addFraction(f1, f2);
		System.out.println(f3.getNumerator()+"/" + f3.getDenominator());
		
		Fraction f4 = new Fraction(3,7);
		Fraction f5 = new Fraction(8,9);
		
		f4.addFraction(f5);
		System.out.println(f4.getNumerator()+"/" + f4.getDenominator());
		
		
		Fraction f6 = new Fraction(3,4);
		Fraction f7 = new Fraction(2,3);
		
		Fraction f8 = new Fraction();
		f8 = f6.addFraction_2(f7);
		System.out.println(f8.getNumerator()+"/" + f8.getDenominator());
	}

}
