package exe9_7;

public class Account_Customer extends Account{

	private String name;
	
	public Account_Customer() {
		super();
	}
	
	public Account_Customer(int id, double newBalance, String name) {
		super(id, newBalance);
		this.name=name;
	}
	
	
}
  