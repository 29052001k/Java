package javaProject;

import java.util.ArrayList;

public class classCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> cars=new ArrayList<String>();
		
		
	//add
	
	cars.add("Audi");
	cars.add("Maruti");
	cars.add("BMW");
	cars.add("Thar");
	cars.add("Suzuki");
	cars.add("Scorpio");
	
	System.out.println(cars);  // give Array[Audi, Maruti, BMW, Thar, Suzuki, Scorpio]
	
	// retrive
	
	String cars1=cars.get(3);
	System.out.println(cars1);
	
	String a=cars.get(2);
	System.out.println(a);  /// using get for retrive the value
	
	// update
	
	cars.set(1, "Alto");
	System.out.println(cars);
	
	cars.set(0, "Swift");
	System.out.println(cars);  // use set for update the value
	
	
	//remove
	
	cars.remove(2);
	System.out.println(cars);  // use remove to delete the value
	
	
	// using for loop
	
	for(int i=0;i<cars.size();i++) {
		System.out.println(i);  // for index number
		System.out.println(cars.get(i));
		}
		
	
	// using for each loop
	
	for(String c:cars) {
		System.out.println(c);
	}
	
		
	}

}
