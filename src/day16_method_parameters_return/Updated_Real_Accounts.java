package day16_method_parameters_return;

public class Updated_Real_Accounts {
	
	public static void main(String[] args) {
		
		Updated_Bank_Account account1 = new Updated_Bank_Account();
		
		account1.setAccountNumber(12345678);
		System.out.println(account1.accountNumber); // 12345678 outputted
		
		/*
		 *               01234
		 * String str = "hello";
		 * str.charAt(1); -> example of method that accepts parameters that we have already used
		 * 
		 * str.substring(1);
		 * str.substring(1, 5);
		 * 
		 * public void charAt(int number) {
		 * 
		 * 		Syso(character)
		 * }
		 */
	
	
		String str = "Java";
		System.out.println(str.charAt(0));
		
		/*
		 * SUMMARY:
		 * 1. Methods in java can have parameters/arguments
		 * 2. Method parameters are in parenthesis following the method name
		 * 3. Parameters variables have data and name
		 * 4. Anyone who calls the method must provide the parameters of the matching data type
		 * 5. Anyone who calls the method must provide the same number of parameters 
		 * 
		 * The purpose of having parameters/arguments is to make methods more reusable.
		 */
	
		Updated_Bank_Account account2 = new Updated_Bank_Account();
		account2.setBalance(100);
		account2.deposit(50);
		account2.withdraw(700);
		
		
	
	
	
	
	
	}

}
