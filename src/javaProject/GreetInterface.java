package javaProject;

public class GreetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Zz z =new Zz();
z.greet();
z.greet1();
z.KK();

Ddd rr=new Ddd();
rr.greet();
rr.greet1();
rr.Loan();
	}

}

// program 1
interface Xx{
	public void KK();
	
	
	default void greet1() {
		System.out.println("Hello Greet");
	}
	
	default void greet() {
		System.out.println("Hello Greet2");
	}
}

 class Zz implements Xx{

	@Override
	public void KK() {
		// TODO Auto-generated method stub
		System.out.println("Bye");
	}
	 
	 
 }
 
 
// program 2
 
interface Gf{
	 public void Loan();
	 
	 default void greet() {
		 System.out.println("Loan from SbI");
	 }
	 
	 default void greet1() {
		 System.out.println("Save from SBI");
	 }
 }

class Ddd implements Gf{

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan");
	}
	
}