/*Write a Java class to represent a bus. A bus contains attributes color, number of passengers and static variable numBuses.
 * You should provide a default constructor to create a bus with red color and a second constructor which creates a bus with given color and number 
 * of passenger. The bus should provide three methods: the method board () increases and disembark() decreases the number of passengers on a bus 
 * respectively and method to increases the number of buses in the class.
 *  
 *  Write a user class for bus class, create 3 bus instances and then test appropriate function and display their attributes.
 * ---***---
 * OOP
 * class name
 * attribute
 * method
 */

package revision_exe;

public class Bus {
	
	private String color;
	private int numPassengers;
	private static int numBuses=0; 
	
	public Bus() { 
		color = "red";
	}
	
	public Bus(String c, int numForPassengers) {
		this.color=c;
		this.numPassengers=numForPassengers;
	}
	
	public void board(int num) {
		numPassengers+=num;
	}
	
	public void disembark(int num) {
		numPassengers-=num;
	}
	
	public static void incBus() { 
		numBuses++;
	}

	public static int getNumBuses() {
		return numBuses;
	}

	public static void setNumBuses(int numBuses) {
		Bus.numBuses = numBuses;
	}
	
	
	
	
}
