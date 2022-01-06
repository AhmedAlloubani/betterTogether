package review_session;

//Bean
public class House extends Structure{
	private static int counter;
	private int houseNumber;
	
	private double price;
	private double size;
	
	private boolean isCamerasInstalled;
	
	
	


	public House(double price, double size, boolean isCamerasInstalled) {
		houseNumber = ++counter;
		setPrice(price);
		setSize(size);
		setCamerasInstalled(isCamerasInstalled);
	}


	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		House.counter = counter;
	}


	public int getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public boolean isCamerasInstalled() {
		return isCamerasInstalled;
	}


	public void setCamerasInstalled(boolean isCamerasInstalled) {
		this.isCamerasInstalled = isCamerasInstalled;
	}


	@Override
	public String toString() {
		return "House [houseNumber=" + houseNumber + ", price=" + price + ", size=" + size + ", isCamerasInstalled="
				+ isCamerasInstalled + "]";
	}
	
	
	
	
	
	

}
