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

public class Fraction {

	// variable
	private int numerator;
	
	private int denominator;
	
	public Fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}
	
	// 2-argument constructor
	public Fraction(int numer, int denomi) {
		if (denomi != 0) {
			this.numerator = numer;
			this.denominator = denomi;
		}
		else {
			System.out.println("Deniminator must not be zero ");
		}
	}
	
	
	// method
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void addFraction(Fraction f1, Fraction f2) {
		
		this.numerator = (f1.numerator * f2.denominator) + (f1.denominator * f2.numerator);
		this.denominator = (f1.denominator * f2.denominator);
	}
	
	public void subFraction(Fraction f1, Fraction f2) {
		
		this.numerator = (f1.numerator * f2.denominator) - (f1.denominator * f2.numerator);
		this.denominator = (f1.denominator * f2.denominator);
	}
	
	public void multiFraction(Fraction f1, Fraction f2) {
		
		this.numerator = (f1.numerator * f2.numerator);
		this.denominator = (f1.denominator * f2.denominator);
	}
	
	public void divFraction(Fraction f1, Fraction f2) {
		
		this.numerator = (f1.numerator * f2.denominator);
		this.denominator = (f1.denominator * f2.numerator);
	}
	
	public void addFraction(Fraction f) {
		
		this.numerator = (this.numerator * f.denominator) + (this.denominator * f.numerator); // this = object call / f = 
		this.denominator = (this.denominator * f.denominator);
	}
	
	public Fraction addFraction_2(Fraction f) {
		
		Fraction res = new Fraction (1,1);
		
		res.numerator = (this.numerator * f.denominator) + (this.denominator * f.numerator); // this = object call / f = 
		res.denominator = (this.denominator * f.denominator);
		
		return res;
	}
	
	public void reduce() {
		// 32 % 8 == 0 --> gcd =8
		// 10/15 --> 15 % 10 != 0 --> 
		//           10 % 5 == 0 --> gcd =5
		// 
		
		
		int gcd = 1;
		int num;
		if(this.denominator < this.numerator) {
			
			
		}
	}
	
	

}
