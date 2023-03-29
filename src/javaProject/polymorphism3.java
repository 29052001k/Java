package javaProject;

public class polymorphism3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// over loading
				 calculator a1  =new calculator();
				 a1.addition(10, 20);
				 a1.addition(10, 20,30);
				 a1.addition(10, 20,40);
				 
				 // default overloading
		    personGA a21=new personGA();
		    personGA a22=new personGA(1);
		    personGA a23=new personGA(1,2);
		    personGA a24=new personGA(1,2,3);
				 
				 // overriding
				 //program 1
				  SBI e1= new SBI();
				 e1.Saving(1);
				 e1.Loan(1333);
				 
				 
				 // program 2
				 SonV Amol=new SonV("Navanth","Hadole","Amol");
				 System.out.println(Amol.fName);
				 System.out.println(Amol.lastName);
				 System.out.println(Amol.SName);
				 
				 Amol.displayName();
				 Amol.displaySname();
			}

		}


		// overloading(same class,same method,different signature)

		class calculator{
			
			public void addition(int x, int y) {
				System.out.println(x+y);
			}
			public void addition(int x, int y,int z) {
				System.out.println(x+y+z);
			}
			public void addition(int x, int y,int z, int a) {
				System.out.println(x+y+z+a);
			}
		}

		//default constructor

		class personGA {
			public personGA() {
				System.out.println("default constructor is called");
			}
			public personGA(int x) {
				System.out.println("default constructor with one parameter" +(x));
			}
			public personGA(int x,int y) {
				System.out.println("default constructor with one parameter" +(x+y));
			}
			public personGA(int x,int y,int z) {
				System.out.println("default constructor with one parameter"+(x+y+z));
			}
		}

		// overriding(same method ,same signature,diff classs)
		//program 1
		class worldBankW{
			
			public void Saving(int x) {
				System.out.println("worldBank Saving:" + x);
			}
			
			public void Loan(int y) {
				System.out.println("worldBank Loan:" + y);
			}
		}

		class SBI extends worldBankW{
			
			public void Saving(int x) {
				System.out.println("SBI Saving:" + x);
			}
			
			public void Loan(int y) {
				System.out.println("SBI Loan:" + y);
			}
		}

		// program 2

		class fatherV{
			String fName;
			String lastName;
			
			public fatherV(String fN,String ln) {
				this.fName=fN;
				this.lastName=ln;
				
			}
			public void displayName() {
			System.out.println(this.fName + this.lastName);
			
			}
			}

     
		class SonV extends fatherV{
			String SName;
			
			public SonV(String fN,String ln,String sN) {
				super (fN,ln);
				this.SName=sN;
			}
			public void displaySname() {
				System.out.println(this.SName + this.lastName);
			}
			
		}