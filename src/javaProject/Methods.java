package javaProject;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="I am learning selenium";
		System.out.println(firstName);
		

		// String +  Integer =====> String 
		// Integer + String  =====> String 
		// String  + String  =====> String 
		// Integer + Integer ====> Integer
		
		System.out.println("Hello"+2);  //Hello2
		System.out.println(2 +"2");  //22
		System.out.println(2+2);     //4
		System.out.println("2"+"2");    //22
		
		// methods
		
		String firstName1="Aryan";
		int q1=firstName1.length();
		System.out.println(q1);
		System.out.println(firstName1);
		
		// program 1
		
		String firstName2="kalyani";
		String lastName="hadole";
		String q2= firstName2. concat(lastName);
		System.out.println(q2);
		System.out.println(firstName2 + " " + lastName);
		
		String fN="amruta";
		String lN="pawar";
		String q3=fN .concat(lN);
		System.out.println(q3);
		
		
		// program 2
		
		// toUpperCase()
		String city="Nagpur";
		String q11=city.toUpperCase();
		System.out.println(q11);
		
		// program 3
		// toLowerCase()
		String city2="PUNE";
		String q22=city2.toLowerCase();
		System.out.println(q22);
			
		// method chaining
		String city3="Mumbai";
		city3.toUpperCase().toLowerCase().length();
		
		// program 4
		
		String city4="Pune";
		String city5="Pune";
		String city6="Thane";
		
		System.out.println(city4. equals(city6));
		System.out.println(city4.equals(city5));
		
		if(city4. equals(city6)) {
			System.out.println("Same City");
		}else{
			System.out.println("different City");
		}
		
		
		if(city4.equals(city5)) {
			System.out.println("Same City");
		}else{
			System.out.println("different City");
		}
		
		
		String a = city4. equals(city6) ? "equal":"not equal";
		System.out.println(a);
	
		// program 5
		// startsWith()
		String city8 = "ujjain";
		boolean q33 = city8.startsWith("u");
		boolean q34 = city8.startsWith("Ujj");
		System.out.println(q33);  //true
		System.out.println(q34);   //falsee
	
		// program 6
		// endWith()
		String city9 = "ujjain";
		boolean q55 = city9.endsWith("in");
		boolean q66 = city9.endsWith("ai");
		System.out.println(q55);  //true
		System.out.println(q66); //false
		
		
		// program 6
		// contains()
		String j = "I am learning java";
		boolean e1 = j.contains("am");
		System.out.println(e1);  //true

	}
	

}
