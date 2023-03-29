package javaProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class practiceSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> cars1=new ArrayList<String>();
		
		// add
		
		cars1.add("audi");
		cars1.add("BMW");
		cars1.add("Scorpio");
		cars1.add("Thar");
		cars1.add("Swift");
		
		System.out.println(cars1);
		
		// retrive
		
		String aa=cars1.get(2);
		System.out.println(aa);
		
		// update
		
		cars1.set(3, "Alto");
		System.out.println(cars1);
		
		// remove
		
		cars1.remove(3);
		System.out.println(cars1);
		
		// HashSet
		
		HashSet<String> names2=new HashSet<String>();
		
		
		// add
		
		names2.add("jayshree");
		names2.add("Anshul");
		
		System.out.println(names2);
		
		boolean a=names2.contains("anshul");
		System.out.println(a);
		
		boolean b=names2.contains("Anshul");
		System.out.println(b);
		
		
		// HashMap
		
		HashMap<String,String> capital=new HashMap<String , String>();
		
		// add
		
		capital.put("MH", "Mumbai");
		capital.put("MP", "Bhopal");
		
		System.out.println(capital);
		
		// retrive
		
		String ss=capital.get("MH");
		System.out.println(ss);
		
		// update
		
		capital.put("MH", "Bombay");
		System.out.println(capital);
		
		// remove
		
		capital.remove("MH");
		System.out.println(capital);
	}

}
