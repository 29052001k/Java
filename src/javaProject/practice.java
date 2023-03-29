package javaProject;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kalyani = new Student();
		System.out.println(kalyani.firstName);
		System.out.println(kalyani.lastName);
	    System.out.println(kalyani.age);
	   kalyani.displayName();
	}

}

class Student {
    String firstName="kalyani";
    String lastName="hadole";
    int age=22;

public void displayName() {
	System.out.println(this.firstName +this.lastName);
}

}
	


