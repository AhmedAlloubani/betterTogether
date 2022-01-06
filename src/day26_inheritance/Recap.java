package day26_inheritance;

public class Recap {
	
	
		
		/*
		 * Recap:
		 * 
		 * 	- ArrayList: flexible, can be resized, part of collection framework, only accepts non-primitive (Class/Reference 
		 * data type), can contain different data types, indexed collection, indexing starts with 0
		 * 		- Wrapper Class: Byte, Short, Integer, Character, Float, Double, Long, Boolean;
		 * 		- ArrayList<Integer> list = new ArrayList<>();
		 * 			list.add(4); - autoboxing: converting primitive to a Wrapper Class
		 * 
		 * 		for(int num : list) {       		- unboxing: converting a Wrapper Class to a primitive (automatically)
		 * 			print("the number is " + num);
		 * 
		 * 		}
		 * 
		 * 		- List<String> list2 = new ArrayList<>();
		 * 		- ++ vs equals(); memory location vs contents
		 * 		- contains(), containsAll();
		 * 			- contains() - checks if the object in the ArrayList;
		 * 			- containsAll() - checks if all the elements of another ArrayList are in this ArrayList (order doesn't matter)
		 * 
		 * 		String[] flowers = {"Roses", "Tulips", "Lilies"};
		 * 		List<String> flowerList = Arrays.asList(flowers);
		 * 
		 * 		List<Strin> flowerList = Arrays.asList("Roses", "Tulips", "Lilies"); - combined declaration and assignment
		 * 		// creates a fixed size arraylist.
		 * 		flowerlist.add("Cactus"); - "UnsupportedOpertaionException"
		 * 
		 * 		- Collections.sort(flowerList); - sort the list for us.
		 * 
		 * 		- Inheritance: one of the OOP concepts.
		 * 		- Reusability: child class acquires properties of the parent class
		 * 		- private members (variables and methods) are not accessible to a child class
		 * 		- Super class and sub class
		 * 
		 * 		public class A {
		 * 			private int PIN = 123412441;
		 * 			int var;
		 * 		
		 * 			public void print() {
		 * 			Print("Hello");
		 * 		}
		 * 	}
		 * 
		 * 		public class B extends A {
		 * 
		 * 			public void buildArray() {
		 * 			}
		 * 
		 * 		} 
		 * 
		 * 		public class C extends B {
		 * 
		 * 		}
		 * 
		 * 		A - super class
		 * 		B - child/sub class, parent or super class to c
		 * 		C - child/sub class
		 * 
		 * 
		 * 		main {
		 * 
		 * 			B b = new B();
		 * 			b.print();
		 * 			b.PIN; // will not compile because java will not let access the private class
		 * 
		 * 			C c = new C();
		 * 			c.print(); // grandchild also has access to garandparent's members
		 * 		}
		 * 
		 * 
		 * 
		 *  
		 */
	//	public static void main(String[] args) {
			
		//	A a = new A();
			// a. a.equals(a); a will see its parent's methods. The parent of A is by default an object 
			
	//	}
		
// }
	
	
	/*
	 * Task:
	
	
	 *Go to the bank of america website and locate the two upper tabs;
	 *Save contents of these tabs into two different arraylists;
	 *add "Wealth Management" from the first list to the second list;
	 *remove "Better Money Habits" from the second list;
	 *sort the second list;
	 *check if the second list contains all the elements of the first list;
	 */
	
	
}
	
	
	
	
