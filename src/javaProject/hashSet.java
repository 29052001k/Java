package javaProject;


import java.util.ArrayList;
import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> names = new HashSet<String>();
		
		// add
		names.add("Kalyani");
		names.add("Amol");
		names.add("Nilesh");
		names.add("Sonaxi");
		names.add("Aryan");
		System.out.println(names);
		
		boolean aa=	names.contains("Aryan"); 
		boolean bb=	names.contains("aryan");  // for check the value is available or not
		
		System.out.println(aa);
		System.out.println(bb);
		
		
		names.clear();
		System.out.println(names);
		
		// for each
		
		for(String a:names) {
			System.out.println(a);
			
	}	
			
			ArrayList<String> names2= new ArrayList<String>();
			
			// add
			
			names2.add("amruta");
			names2.add("aryan");
			System.out.println(names2);
			
		
			for(int i=0;i<names2.size();i++) {
				if(names2.contains(names2.get(i))) {
					System.out.println(names2.get(i)+" "+ "element is available on set");
				}
				else {
					System.out.println(names2.get(i)+" " + "elemetn is not available on set");
				}
			}
		
	}

}
