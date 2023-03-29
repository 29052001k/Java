package javaProject;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// program 1
		SBIA sbi=new SBIA("Pune","India",12234);
		
		System.out.println(sbi.city);
		System.out.println(sbi.country);
		System.out.println(sbi.pincode);
		
		sbi.Loan();
		sbi.Save();
		sbi.displayCityName();
		
		
		// program 2
		RBI rbi=new RBI("Mumbai","India");
		
		
		System.out.println(rbi.city);
		System.out.println(rbi.country);
		
		rbi.Loan();
		rbi.Save();
		rbi.displayCityName();
		

	}

}
// Abstract Methods
// we can't create object of absract class

abstract class WorldBank{
	String city;
	String country;
	
	public  WorldBank(String cty,String Cnt) {
		this.city=cty;
		this.country=Cnt;
	}
	
	// abstract methods
	abstract public void Loan();
	abstract public void Save();
	
	
	public void displayCityName() {
		System.out.println("India");
	}
}


class SBIA extends WorldBank{
int pincode;
	public SBIA(String cty, String Cnt,int Pn) {
		super(cty, Cnt);
		this.pincode=Pn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan from SBIA");
		
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		System.out.println("Saving From SBIA");
		
	}
	
}

 class RBI extends WorldBank{
	
	 
	 public RBI(String cty, String Cnt) {
		 super(cty, Cnt);
	 }

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan from RBI");
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		System.out.println(("Saving From RBI"));
	}
	 
	 
	 
 }