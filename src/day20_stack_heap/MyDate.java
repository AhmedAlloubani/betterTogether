package day20_stack_heap;

public class MyDate {
	
	/*
	 * - generate all the getters and setters;
	 * - create a no-argument constructor that sets the date to 1/1/2021
	 * - create a constructor that accepts day, month and year and assigns them to the instance variables
	 * - create a method called toString() that returns a String, accepts no arguments and returns a date
	 * as a String in the following format: 3/5/2000
	 */

	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		this.day = 1;
		this.month = 1;
		this.year = 2021;
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String toString() {
		String str = getDay() + "/" + getMonth() + "/" + getYear();
		return str;
	}
	
	
	
	
}
