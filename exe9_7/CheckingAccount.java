/*
 * 11.3 
 */

package exe9_7;

public class CheckingAccount extends Account{
	
	private double overdraftLimit;
	
	public CheckingAccount() {
		super();
		overdraftLimit = 100.0;
	}
	
	public CheckingAccount(int id, double newBalance, double overdraftLimit) {
		super(id, newBalance);
		this.overdraftLimit = overdraftLimit;
	}
	
	//method
	public void withdraw(double amount) {
		
		if(amount <= this.getBalance()+overdraftLimit)
			this.setBalance(this.getBalance()-amount);
		else
			System.out.println("withdraw unsuccessful");
	}
	
	public String toString() {
		return super.toString()+"\nOverdraft Limit= "+this.overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	

}
