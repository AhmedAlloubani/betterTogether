package day19_contructors_this;

public class Computer {
	
	private int RAM;
	private int CPU;
	private String OS;
	private double price;
	
	public Computer() {
		this(8, 1000, "Windows", 300);
		System.out.println("No-argument constructor");
		
	}
	
	
	public Computer(int RAM) {
		this(); // we are calling the other constructor located in the same class (nor-args constructor)
		// this() must be the first thing in constructor
		this.RAM = RAM;
	}
	
	public Computer(int RAM, int CPU) {
		this.RAM = RAM;
		this.CPU = CPU;
	}
	
	public Computer(int RAM, int CPU, String OS) {
		this.RAM = RAM;
		this.CPU = CPU;
		this.OS = OS;
	}
	
	public Computer(int RAM, int CPU, String OS, double price) {
		this.RAM = RAM;
		this.CPU = CPU;
		this.OS = OS;
		this.price = price;
		
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = RAM;
	}
	public int getCPU() {
		return CPU;
	}
	public void setCPU(int cPU) {
		CPU = cPU;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
		
	

}
