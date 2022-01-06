package review_session;

public class Uncle_Bobbys  extends Local_Restaurant{
	
	 {
		menu.add("Ice-cream");
	}
	 
	 private static double balance;
	 private boolean serveIcecream;
	 
	 public Uncle_Bobbys(double menuItemPrice) {
		 super.menuItemPrice = menuItemPrice;
	 }

	@Override
	public void giveFreeIceCream(boolean response) {
		if(response) {
			serveIcecream = true;
		}
		
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
		System.out.print("Your change is $" + change);
		
		if(serveIcecream) {
			System.out.println(" plus free ice-cream");
		}else {
			System.out.println();
		}
		
		balance = balance + menuItemPrice;
		
	}

	@Override
	public String toString() {
		return "Uncle_Bobbys[menuItemPrice=" + menuItemPrice + ", balance=]" + balance + "]";
	}
	
	

}
