package day16_method_parameters_return;

public class Updated_Bank_Account {
	
	int accountNumber;
	String accountHolder;
	double balance;
	String bankName;
	
	//                                12345678
	public void setAccountNumber(int accountNum) { // parameter/argument to a method
		accountNumber = accountNum;
		System.out.println("Account number has been set to " + accountNum);
		
		
	}
	
	public void setBalance(double amount) {
		balance = amount;
		System.out.println("The balance has been set to " + amount);
	}
	
	public 
	void deposit(double amount) { 
		balance += amount; // -> balance = balance + amount
		System.out.println("Your balance is " + balance);	
	}
	
	public void withdraw(double amount) {
		if (balance < 0) {
			System.out.println("This account has negative balance");
		} else if (amount > balance) {
			System.out.println("Insufficient funds");
		} else {
			balance -= amount;
			System.out.println("Your balance now is " + balance);
		}
		
	}
	/*
	 * - setBalance;
	 * - deposit; 
	 * 
	 * accept parameters and perform the logic according to its name
	 */

}
