package exe11_8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	
	public Account() {
		
		this.name=""; // "" is null value
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 0.0;
		this.dateCreated = new Date();
		transactions= new ArrayList<Transaction>();
	}
	
	public Account(int id, double newBalance, String name) {
		
		this.name=name;
		this.id = id;
		this.balance = newBalance;
		this.dateCreated = new Date();
		transactions= new ArrayList<Transaction>();
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
		
		if(amount <= this.balance){
			this.balance -= amount;
			transactions.add(new Transaction('W',amount, this.balance,"Withdraw From account"));
		}
			
		else
			System.out.println("withdraw unsuccessful");
	}
	
	public void deposit(double amount) {
		
		this.balance += amount;
		transactions.add(new Transaction('D',amount, this.balance,"Deposit To account"));
	}
	
	public String toString() {
		return "ID= "+this.id+"\nDate Created= "+this.dateCreated+"\nName="+this.getName()+"\nBalance = "+this.getBalance();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
/*
	public void displayAccInfo() {
		System.out.println(toString());
		
		for(int i=0;i<this.getTransactions().size();i++)
		{
			System.out.println("Date: "+this.getTransactions().get(i).getDate()+"\n");
			System.out.println("Type: "+this.getTransactions().get(i).getType()+"\n");
			System.out.println("Amount: "+this.getTransactions().get(i).getAmount()+"\n");
			System.out.println("Balance: "+this.getTransactions().get(i).getBalance()+"\n");
			System.out.println("Description: "+this.getTransactions().get(i).getDescription()+"\n");
			
		}
			
	}
*/

	
}
