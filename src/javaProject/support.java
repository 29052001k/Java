package javaProject;

public class support {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
			PersonM amol = new PersonM();
					System.out.println(amol.fullName);
					System.out.println(amol.age);
					System.out.println(amol.adharCard);
					amol.displayName();

	}

}


class PersonM {

	String fullName = "Sagar";
	int age = 30;
	int adharCard = 90;

	public void displayName() {
		System.out.println(this.age);
	
	}
	}
