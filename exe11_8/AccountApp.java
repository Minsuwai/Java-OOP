package exe11_8;

public class AccountApp {

	public static void main(String[] args) {
		
		Account acc_1 = new Account(1122,1000,"George");
		
		acc_1.setAnnualInterestRate(1.5);
		
		acc_1.deposit(30);
		acc_1.deposit(40);
		acc_1.deposit(50);
		
		acc_1.withdraw(5);
		acc_1.withdraw(4);
		acc_1.withdraw(2);
		
//		System.out.println("Name: " + acc_1.getName());
//		System.out.println("Balance = " + acc_1.getBalance());
//		System.out.println("Monthly Interest = " + acc_1.getMonthlyInterest());
//		System.out.println("Date Created = " + acc_1.getDateCreated());
//		System.out.println("All Transactions: " + acc_1.getTransactions());
		
		System.out.println(acc_1.toString());
		System.out.println("Transaction List: \n");
		for(int i=0;i<acc_1.getTransactions().size();i++) {
			
			System.out.println(acc_1.getTransactions().get(i).toString());
		}
		

	}

}
