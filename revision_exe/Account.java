/*
 * Write a java class that represents a bank account.
 * A bank account contains such information as : name of account holder, account number, current balance. 
 * The bank account class must contain static information to keep track of the number of account created. 
 * You should provide a constructor for the creation of bank account objects.
 * The objects shall have given names, account numbers and with an initial balance of zero.
 * You must keep track of the total number of accounts created as well.
 * Provide methods to deposit and withdraw from the account, these methods should report if the operations are successful and if so,
 * report the new balance after the operations. Finally, provide a method to print out summary of a bank account and a class method that prints
 * out the number of accounts created.
 */

package revision_exe;

public class Account {
	
	private String name;
	private int id;
	private double balance;
	
	// static information
	private static int no_of_acc=0;
	
	//constructor
	public Account() {
		
		this.name="No Name";
		this.id=0;
		this.balance=0.0;
		no_of_acc++; //  You must keep track of the total number of accounts created as well
	}
	
	public Account(String name, int ID) {
		
		this.name=name;
		this.id=ID;
		this.balance=0;
	}
	
	//method
	public void deposit(double amount) {
		this.balance+=amount;
	}

	public void withdraw(double amount) {
		this.balance-=amount;
	}
	
	public void summary() {
		
	}

	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getNo_of_acc() {
		return no_of_acc;
	}

	public static void setNo_of_acc(int no_of_acc) {
		Account.no_of_acc = no_of_acc;
	}
}
