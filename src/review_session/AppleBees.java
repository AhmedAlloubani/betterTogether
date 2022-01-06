package review_session;

public class AppleBees extends Chain_Restaurant{
	
	private static double balance;
	
	public AppleBees(double menuItemPrice) {
		super.menuItemPrice = menuItemPrice;
		
	}

	@Override
	public void runPromotion(int discountPercent) {
		menuItemPrice = menuItemPrice *(100 - discountPercent)/100;
		System.out.println("Promotion! " + discountPercent + "%off!");
		
	}

	@Override
	public void showMenu() {
		System.out.println("This is the menu " + menu);
		
	}

	@Override
	public void serveFood(int itemNumber) {
		
		if(itemNumber < menu.size() && itemNumber >= 0) {
		System.out.println("Serving " + menu.get(itemNumber));
		}else {
			System.out.println("Item is not available");
		}
	}

	@Override
	public void acceptPayment(double amount) {
		System.out.println("Accepted" + amount);
		
		double change = amount - menuItemPrice;
		System.out.println("Your change is $" + change);
		
		balance = balance + menuItemPrice;
	}

	@Override
	public String toString() {
		return "AppleBees [menuItemPrice=" + menuItemPrice + ", balance=" + balance + "]";
	}
	
	

}
