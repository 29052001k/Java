package javaProject;

public class ClassPro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Person aryan = new Person();
		System.out.println(aryan.fullName);
		System.out.println(aryan.age);
		System.out.println(aryan.adharCard);
		aryan.displayName();
	
		// Getting the class properties outside the class
		
		aryan.fullName="aryan pawar";
		aryan.age=10;
		aryan.adharCard=2212;
		aryan.displayName();
		
		
		Person kalyani=new Person();
		System.out.println(kalyani.fullName);
		System.out.println(kalyani.age);
		System.out.println(kalyani.adharCard);
		kalyani.displayName();
		
		// using constructor
		
		PersonA kalyaniE = new PersonA ("kalyani hadole",13,3213);
		PersonA kalyaniB = new PersonA ("dhanvi bangal",32,3133);
		PersonA kalyaniC = new PersonA("amruta pawar",11,3213);
		
		kalyaniE.displayName();
		kalyaniB.displayName();
		kalyaniC.displayName();
		
		
		// setter
		PersonF poorva=new PersonF();
		poorva.setfullName("poorva vyas");
		poorva.setAge(29);
		poorva.setadharCard(123);

		System.out.println(poorva.fullName);
		System.out.println(poorva.age);
		System.out.println(poorva.adharCard);
		
	}


}
class Person  {
	String fullName="kalyani hadole";
	int age=22;
	int adharCard=6600;
	
	public void displayName() {
		System.out.println(this.fullName);
	}
	
}
	
	class PersonA {
		String fullName;
		int age;
		int adharCard;
		
		public PersonA(String fn, int ag, int ad){
			this.fullName=fn;
			this.age=ag;
			this.adharCard=ad;
		}
		
		public void displayName() {
			System.out.println(this.fullName);
		}
	}

		// Setter and Getter 
		
		class PersonF{
			String fullName;
			int age;
			int adharCard;
			
			public void setfullName(String fn) {
				this.fullName=fn;
			}
			
			public void setAge(int ag) {
                this.age=ag;
			}
			public void setadharCard(int ad) {
				this.adharCard=ad;
			}
			
		}	
	
