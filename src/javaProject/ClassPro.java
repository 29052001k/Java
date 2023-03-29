package javaProject;

public class ClassPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	Student Kalyani = new Student();
//		System.out.println(Kalyani.firstName);
//		System.out.println(Kalyani.lastName);
//	    System.out.println(Kalyani.age);
//	    Kalyani.displayName();
//	
//	
//	Student aryan=new Student();
//	System.out.println(aryan.firstName);
//	System.out.println(aryan.lastName);
//	System.out.println(aryan.age);
//    aryan.displayName();
//
//	    
	    
	    
//  setting the properties outside the class
    
//    aryan.firstName="aryan";
//    aryan.lastName="pawar";
//    aryan.age=12;
//    aryan.displayName();
//    
    
    PersonB Amruta=new PersonB("Amruta","Pawar",29);
    PersonB Samruddhi=new PersonB("Samruddhi","Kumawat",14);
    
    Amruta.displayName();
    Samruddhi.displayName();
    
    
	}
	
}

//
//
 
		class PersonB{
			String firstName;
			String lastName;
			int age;
		
			public PersonB(String fn, String ln, int ag) {
				this.firstName=fn;
				this.lastName=ln;
				this.age=ag;
			}
				public void displayName() {
					System.out.println(this.firstName+this.lastName);
				}
			
		}
			
//
//class Student {
//			String firstName = "chinmay";
//			String lastName = "deshpande";
//			int age = 12;
//			
//		public void displayName() {
//				System.out.println(this.firstName + this.lastName);
//			}
//		}
//	    
