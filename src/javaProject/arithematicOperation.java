package javaProject;

public class arithematicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println(x);
		
		String firstName="Kalyani";
		System.out.println(firstName);
		
		// Arithematic Operations
		
		// +,-,%,/,*
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a/b);
	
		// functions
		// 10==50 lines
		
		 Calculator(12,4);
		 Calculator(6,3);
		 

		 Addition();
		 Addition();
		 Addition();
		 Addition();
		 Addition();
		
		 
		 AdditionB(12,5);
		 AdditionB(12,33);
		 AdditionB(12,50);
		 AdditionB(12,3);


		int a11 = AdditionC(234,5);
		System.out.println(a11);
		System.out.println(a11 * 0.10);
		System.out.println(a11 - 10);

	

	}
	
	public static void Calculator(int x ,int y) {
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
	}
	// basic Functions
	// function with parameter and with return return type 

	public static void Addition() {
		System.out.println(10+12);
	}
	
	// function parameter with return type
	public static void AdditionB(int x, int y) {
		System.out.println(x+y);
	}


	// function with parameter and with return type
	
	public static int AdditionC(int x,int y) {
		return x+y;
	}
	
}



