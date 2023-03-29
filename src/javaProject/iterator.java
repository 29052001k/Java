package javaProject;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> cities=new ArrayList<String>();
		
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nagpur");
		cities.add("Thane");
		
		Iterator<String> k=cities.iterator();
		
		System.out.println(k.next());
		System.out.println(k.next());
		System.out.println(k.next());
		System.out.println(k.next());
		System.out.println(k.hasNext());
		
		
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(13);
		numbers.add(15);
		numbers.add(16);
		numbers.add(18);
		numbers.add(8);
		numbers.add(7);
		numbers.add(71);

		
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i) < 10) {
				numbers.remove(i);	
				System.out.println(numbers);
			}
		}
	}

}
