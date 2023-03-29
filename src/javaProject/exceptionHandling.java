package javaProject;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome in Java");
		try {
		int []a=new int[3];
		a[0]=11;
		a[1]=31;
		a[2]=21;
//		a[3]=12;
//		
		
		System.out.println(a[2]);
		
		System.out.println(a[0]);
		
		System.out.println(10/0);
		}
		catch(ArithmeticException E) {
			System.out.println("Incorrect user information");
		}
		finally{
			System.out.println("Finally it will be run");
		}
		System.out.println("last line of program");
	}
	
	

}
