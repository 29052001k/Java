package javaProject;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String ,String> h=new HashMap<String, String>();
		
		// add
		h.put("MH", "Maharastra");
		h.put("UP", "lunknow");
		h.put("MP", "bhopal");
		h.put("HM", "shimla");
		
		System.out.println(h);  // give object
		
		
		/// retrive
		
		String c=h.get(2);
		System.out.println("HM");
		
		String d=h.get("UP");
		System.out.println(d);
		
		// update
		
		h.put("MH", "Mumbai1");
		System.out.println(h);
		
		h.put("UP", "lunknow1");
		System.out.println(h);
		
		//remove
		
		h.remove("MH");
		System.out.println(h);
		
		
		
	}

}
