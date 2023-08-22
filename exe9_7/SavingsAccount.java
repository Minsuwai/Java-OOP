package exe9_7;

public class SavingsAccount extends Account{	
	
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double newbalance) {
		super(id,newbalance);
	}
	
	public String toString() {
		return super.toString()+"\nYour Amount in Saving Account = "+this.getBalance();
	}
	
	public void withdraw(double amt) {
		
		if(amt<this.getBalance())
			this.setBalance(this.getBalance()-amt);
		else
			System.out.println("Withdraw unsuccessful.\nOverdraft is not allowed in Saving Account");
				
	}

}
