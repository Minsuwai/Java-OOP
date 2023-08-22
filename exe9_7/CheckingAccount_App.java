package exe9_7;

public class CheckingAccount_App {

	public static void main(String[] args) {
		
		CheckingAccount acc = new CheckingAccount(100, 30000, 200);
//		
//		acc.setOverdraftLimit(400);
//		
		acc.withdraw(30200);
		
		
		System.out.println(acc.getOverdraftLimit());
		System.out.println(acc.getBalance());
		

	}

}
