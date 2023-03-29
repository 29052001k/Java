package javaProject;

public class staticCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static Method
		System.out.println(information.Country);
		information.displayCountryName();
		
		
		information imp=new information(45);
		System.out.println(imp.Country);
		
		imp.displayCountry();
		imp.displayCountryName();
		
		
		
		
		
		
	}

}


class information{
	
	static String Country="India";
	int age;
	
	public information(int ag) {
		this.age=ag;
	}
	
	 static public void displayCountryName(){
		
		System.out.println(information.Country);
		
	}
	
	public void displayCountry() {
		System.out.println("this is India");
	}
	
}
