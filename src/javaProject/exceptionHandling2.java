package javaProject;

public class exceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FirstName=null;
		
		try {
			System.out.println(FirstName.charAt(0));
		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("arithemetic exception handling");
//		}
		catch(NullPointerException n){
			n.printStackTrace();
			System.out.println("because \"FirstName\" is null");
		}
		finally {
			System.out.println("this test will be run");
		}
	}

}
