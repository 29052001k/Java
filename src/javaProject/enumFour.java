package javaProject;

enum ColorsB{
RED,
BLUE,
PINK,
BLACK;
	
	private ColorsB() {
		System.out.println("Constructor called");
	}
	
	public void displayColor() {
		System.out.println("Method called");
	}
}







public class enumFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ColorsB CB=ColorsB.BLUE;
		CB.displayColor();
		
		
	}

}
