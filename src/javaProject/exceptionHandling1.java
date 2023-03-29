package javaProject;

public class exceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // checked device
		//unchecked device
		// user input
		System.out.println("Hello");
		try{
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());  /// by zero
		System.out.println(e.toString());         ///java.lang.ArithmeticException: / by zero
System.out.println("Please enter the correct input");  //Please enter the correct input
		}
		finally {
			System.out.println("this block will be run everyTime");
		}
	}

}
