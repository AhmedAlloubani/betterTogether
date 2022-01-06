package day16_method_parameters_return;

public class Bank_Account {
	
	
	/*
	 * - account number
	 * - account holder name
	 * - type of account (checking account only blueprint)
	 * - routing number
	 * - balance
	 * - bank name
	 * 
	 * actions: 
	 * - deposit
	 * - withdrawal
	 * - transfer
	 * - pay
	 */
	
	
	int accountNumber;
	String accountHolder;
	//final String TYPE = "Checking"; // final represents constant in Java, variable name must be in CAPS
	String type = "Checking";
	double balance;
	String bankName;
	
	public void deposit() {
		System.out.println("Depositing money to " + accountNumber);
	}
	
	
	public void withdraw() {
		System.out.println("Withdrawing money from "+ accountNumber);
	}
	
	public void transfer() {
		System.out.println("Transfering money from " + accountNumber);
	}
	
	public void pay() {
		System.out.println("Paying using account " + accountNumber);
	}
	
	public static void main (String[] args) {
		
		Bank_Account account1 = new Bank_Account();
		account1.accountNumber = 44448888;
		account1.accountHolder = "Jeff Bezos";
		account1.balance = 1_000_000;
		account1.bankName = "AmazonBank";
		
		account1.deposit();
		account1.pay();
		account1.transfer();
		
	}
	
	
	public void accountInfo() {
		System.out.println("=================");
		System.out.println("Account number: " + accountNumber);
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Account type " + type);
		System.out.println("Account balance: " + balance);
		System.out.println("Bank name: " + bankName);
	}
	/*
	 * - withdraw -> Withdrawing money from = accNum
	 * - transfer -> Transfer money + accNum
	 * - pay -> paying using account + accNum
	 */

}
