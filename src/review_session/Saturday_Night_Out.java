package review_session;

import java.util.Arrays;

public class Saturday_Night_Out {
	
public static void main(String[] args) {
		
		AppleBees store1 = new AppleBees(19.99);
		store1.setType("Casual Dining");
		store1.runPromotion(10);
		store1.setMenu(Arrays.asList("Hot dog", "Burrito", "Sausage"));
		store1.showMenu();
		store1.acceptPayment(100);
		store1.serveFood(2);
		
		System.out.println(store1);
		System.out.println("=============");
		
		AppleBees store2 = new AppleBees(19.99);
		store2.setType("Casual Dining");
		store2.runPromotion(20);
		store2.setMenu(Arrays.asList("Hot dog", "Burrito", "Sausage"));
		store2.showMenu();
		store2.acceptPayment(50);
		store2.serveFood(1);
		
		System.out.println(store2);
		System.out.println("=============");
		
		Uncle_Bobbys local1 = new Uncle_Bobbys(9.99);
		local1.setType("Local Diner");
		local1.giveFreeIceCream(true);
		local1.setMenu(Arrays.asList("Cup cake", "Lasanga", "Pollo Saltado"));
		local1.showMenu();
		local1.acceptPayment(20);
		local1.serveFood(1);
		
		System.out.println(local1);
		System.out.println("=============");

		Uncle_Bobbys local2 = new Uncle_Bobbys(11.99);
		local2.setType("Local Diner");
		local2.giveFreeIceCream(false);
		local2.setMenu(Arrays.asList("Salmon", "Laghman", "French Fries"));
		local2.showMenu();
		local2.acceptPayment(30);
		local2.serveFood(2);
		
		System.out.println(local2);
		System.out.println("=============");
		
		System.out.println(Restaurant.getCount());
	}

}
