package review_session;

public abstract class Local_Restaurant extends Restaurant {
	
	double menuItemPrice;
	
	public abstract void giveFreeIceCream(boolean response);

	public double getMenuItemPrice() {
		return menuItemPrice;
	}

	public void setMenuItemPrice(double menuItemPrice) {
		this.menuItemPrice = menuItemPrice;
	}
	
	

}
