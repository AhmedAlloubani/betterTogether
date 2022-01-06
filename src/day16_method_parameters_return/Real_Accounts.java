package day16_method_parameters_return;

public class Real_Accounts {
	
	public static void main(String[] args) {

		Bank_Account account1 = new Bank_Account();
		account1.accountNumber = 44448888;
		account1.accountHolder = "Jeff Bezos";
		account1.balance = 1_000_000;
		account1.bankName = "AmazonBank";

		account1.deposit();
		account1.pay();
		account1.transfer();
		
		//System.out.println(account1.accountHolder); // Jeff Bezos
		//System.out.println("The account balance is " + account1.balance); // the account balance is 1000000.0
		
		/*
		 * Create a method called accountInfo that prints the whole information
		 * about the account on separate lines
		 */
	
	account1.accountInfo(); // () represent a method
	account1.accountInfo();
	account1.accountInfo();
	account1.accountInfo();
	account1.accountInfo();
	
	// account.type = "Savings"; // will not compile, type is a constant and can't be changed
	// account1.accountInfo();
	}

}
