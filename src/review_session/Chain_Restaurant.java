package review_session;

public abstract class Chain_Restaurant extends Restaurant {
	
	double menuItemPrice;
	
	
	public abstract void runPromotion(int discountPercent);


	public double getMenuItemPrice() {
		return menuItemPrice;
	}


	public void setMenuItemPrice(double menuItemPrice) {
		this.menuItemPrice = menuItemPrice;
	}
	
	
	

}
