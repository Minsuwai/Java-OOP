package exe9_7;

import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 0.0;
		this.dateCreated = new Date();
	}
	
	public Account(int id, double newBalance) {
		
		this.id = id;
		this.balance = newBalance;
		this.dateCreated = new Date();
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

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return this.balance*(this.getAnnualInterestRate()/100);
	}
	
	public void withdraw(double amount) {
		
		if(amount <= this.balance)
			this.balance -= amount;
		else
			System.out.println("withdraw unsuccessful");
	}
	
	public void deposit(double amount) {
		
		this.balance += amount;
	}
	
	public String toString() {
		return "ID= "+this.id+"\nDate Created= "+this.dateCreated+"\nBalance = "+this.getBalance();
	}
}
